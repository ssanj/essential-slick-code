package slick.jdbc

import scala.language.existentials
import java.sql.{PreparedStatement, ResultSet}
import slick.relational._
import slick.SlickException
import slick.ast.ScalaBaseType

/** Factory methods for JdbcResultConverters which are manually specialized on
  * the underlying JdbcType. A generic implementation of this factory still
  * provides allocation free call paths but performs almost 100% slower in the
  * fast path benchmark. */
object SpecializedJdbcResultConverter {
  /** Create a new type-specialized `BaseResultConverter` for the given type-specialized `JdbcType` */
  def base[T](ti: JdbcType[T], name: String, idx: Int) = (ti.scalaType match {
    case ScalaBaseType.byteType => new BaseResultConverter[Byte](ti.asInstanceOf[JdbcType[Byte]], name, idx)
    case ScalaBaseType.shortType => new BaseResultConverter[Short](ti.asInstanceOf[JdbcType[Short]], name, idx)
    case ScalaBaseType.intType => new BaseResultConverter[Int](ti.asInstanceOf[JdbcType[Int]], name, idx)
    case ScalaBaseType.longType => new BaseResultConverter[Long](ti.asInstanceOf[JdbcType[Long]], name, idx)
    case ScalaBaseType.charType => new BaseResultConverter[Char](ti.asInstanceOf[JdbcType[Char]], name, idx)
    case ScalaBaseType.floatType => new BaseResultConverter[Float](ti.asInstanceOf[JdbcType[Float]], name, idx)
    case ScalaBaseType.doubleType => new BaseResultConverter[Double](ti.asInstanceOf[JdbcType[Double]], name, idx)
    case ScalaBaseType.booleanType => new BaseResultConverter[Boolean](ti.asInstanceOf[JdbcType[Boolean]], name, idx)
    case _ => new BaseResultConverter[T](ti.asInstanceOf[JdbcType[T]], name, idx) {
      override def read(pr: ResultSet) = {
        val v = ti.getValue(pr, idx)
        if(v.asInstanceOf[AnyRef] eq null) throw new SlickException("Read NULL value ("+v+") for ResultSet column "+name)
        v
      }
    }
  }).asInstanceOf[ResultConverter[JdbcResultConverterDomain, T]]

  /** Create a new type-specialized `OptionResultConverter` for the given type-specialized `JdbcType` */
  def option[T](ti: JdbcType[T], idx: Int) = (ti.scalaType match {
    case ScalaBaseType.byteType => new OptionResultConverter[Byte](ti.asInstanceOf[JdbcType[Byte]], idx)
    case ScalaBaseType.shortType => new OptionResultConverter[Short](ti.asInstanceOf[JdbcType[Short]], idx)
    case ScalaBaseType.intType => new OptionResultConverter[Int](ti.asInstanceOf[JdbcType[Int]], idx)
    case ScalaBaseType.longType => new OptionResultConverter[Long](ti.asInstanceOf[JdbcType[Long]], idx)
    case ScalaBaseType.charType => new OptionResultConverter[Char](ti.asInstanceOf[JdbcType[Char]], idx)
    case ScalaBaseType.floatType => new OptionResultConverter[Float](ti.asInstanceOf[JdbcType[Float]], idx)
    case ScalaBaseType.doubleType => new OptionResultConverter[Double](ti.asInstanceOf[JdbcType[Double]], idx)
    case ScalaBaseType.booleanType => new OptionResultConverter[Boolean](ti.asInstanceOf[JdbcType[Boolean]], idx)
    case _ => new OptionResultConverter[T](ti.asInstanceOf[JdbcType[T]], idx) {
      override def read(pr: ResultSet) = {
        val v = ti.getValue(pr, idx)
        if(v.asInstanceOf[AnyRef] eq null) None else Some(v)
      }
    }
  }).asInstanceOf[ResultConverter[JdbcResultConverterDomain, Option[T]]]
}
