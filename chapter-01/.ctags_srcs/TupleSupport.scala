package slick.util

import scala.language.implicitConversions
import scala.reflect.{ClassTag, classTag}
import slick.ast._
import slick.lifted._

/** Utility functions for working with tuples of different arities */
object TupleSupport {
  /** Build a Tuple for the supported arities, otherwise a ProductWrapper. */
  def buildTuple(s: IndexedSeq[Any]): Product = s.length match {
    case 1 => new Tuple1(s(0))
    case 2 => new Tuple2(s(0), s(1))
    case 3 => new Tuple3(s(0), s(1), s(2))
    case 4 => new Tuple4(s(0), s(1), s(2), s(3))
    case 5 => new Tuple5(s(0), s(1), s(2), s(3), s(4))
    case 6 => new Tuple6(s(0), s(1), s(2), s(3), s(4), s(5))
    case 7 => new Tuple7(s(0), s(1), s(2), s(3), s(4), s(5), s(6))
    case 8 => new Tuple8(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7))
    case 9 => new Tuple9(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8))
    case 10 => new Tuple10(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9))
    case 11 => new Tuple11(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10))
    case 12 => new Tuple12(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11))
    case 13 => new Tuple13(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12))
    case 14 => new Tuple14(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13))
    case 15 => new Tuple15(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14))
    case 16 => new Tuple16(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15))
    case 17 => new Tuple17(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15), s(16))
    case 18 => new Tuple18(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15), s(16), s(17))
    case 19 => new Tuple19(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15), s(16), s(17), s(18))
    case 20 => new Tuple20(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15), s(16), s(17), s(18), s(19))
    case 21 => new Tuple21(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15), s(16), s(17), s(18), s(19), s(20))
    case 22 => new Tuple22(s(0), s(1), s(2), s(3), s(4), s(5), s(6), s(7), s(8), s(9), s(10), s(11), s(12), s(13), s(14), s(15), s(16), s(17), s(18), s(19), s(20), s(21))
    case _ => new ProductWrapper(s)
  }

  /** Build an IndexedSeq from a Product */
  def buildIndexedSeq(p: Product): IndexedSeq[Any] = p match {
    case p: ProductWrapper => p.seq
    case p => p.productIterator.toIndexedSeq
  }

  private[this] val tupleClassTags = Vector[ClassTag[_]](
    classTag[Unit],
    classTag[Tuple1[_]],
    classTag[Tuple2[_, _]],
    classTag[Tuple3[_, _, _]],
    classTag[Tuple4[_, _, _, _]],
    classTag[Tuple5[_, _, _, _, _]],
    classTag[Tuple6[_, _, _, _, _, _]],
    classTag[Tuple7[_, _, _, _, _, _, _]],
    classTag[Tuple8[_, _, _, _, _, _, _, _]],
    classTag[Tuple9[_, _, _, _, _, _, _, _, _]],
    classTag[Tuple10[_, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple11[_, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple12[_, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple13[_, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple14[_, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple15[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple16[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple17[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple18[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple19[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple20[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple21[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]],
    classTag[Tuple22[_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _]]
  )
  private[this] val productWrapperTag = classTag[ProductWrapper]

  /** Return a ClassTag for a tuple of the given arity */
  def classTagForArity(i: Int): ClassTag[_] =
    if(i < tupleClassTags.length) tupleClassTags(i) else productWrapperTag
}

/** Extension methods for prepending and appending values to tuples */
object TupleMethods {
  implicit class RepTupleExtensionMethods[T <: Rep[_]](val c: T with Rep[_]) extends AnyVal {
    def ~ [U <: Rep[_]](c2: U with Rep[_]): (T, U) = (c, c2)
    def ~: [U <: Rep[_]](c2: U with Rep[_]): (U, T) = (c2, c)
  }
  implicit class Tuple2ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, U) = (t._1, t._2, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2) = (c, t._1, t._2)
  }
  implicit class Tuple3ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, U) = (t._1, t._2, t._3, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3) = (c, t._1, t._2, t._3)
  }
  implicit class Tuple4ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, U) = (t._1, t._2, t._3, t._4, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4) = (c, t._1, t._2, t._3, t._4)
  }
  implicit class Tuple5ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, U) = (t._1, t._2, t._3, t._4, t._5, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5) = (c, t._1, t._2, t._3, t._4, t._5)
  }
  implicit class Tuple6ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, U) = (t._1, t._2, t._3, t._4, t._5, t._6, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6) = (c, t._1, t._2, t._3, t._4, t._5, t._6)
  }
  implicit class Tuple7ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7)
  }
  implicit class Tuple8ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8)
  }
  implicit class Tuple9ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9)
  }
  implicit class Tuple10ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10)
  }
  implicit class Tuple11ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11)
  }
  implicit class Tuple12ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12)
  }
  implicit class Tuple13ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13)
  }
  implicit class Tuple14ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14)
  }
  implicit class Tuple15ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15)
  }
  implicit class Tuple16ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_], T16 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_], T16 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16)
  }
  implicit class Tuple17ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_], T16 <: Rep[_], T17 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_], T16 with Rep[_], T17 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17)
  }
  implicit class Tuple18ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_], T16 <: Rep[_], T17 <: Rep[_], T18 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_], T16 with Rep[_], T17 with Rep[_], T18 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18)
  }
  implicit class Tuple19ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_], T16 <: Rep[_], T17 <: Rep[_], T18 <: Rep[_], T19 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_], T16 with Rep[_], T17 with Rep[_], T18 with Rep[_], T19 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19)
  }
  implicit class Tuple20ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_], T16 <: Rep[_], T17 <: Rep[_], T18 <: Rep[_], T19 <: Rep[_], T20 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_], T16 with Rep[_], T17 with Rep[_], T18 with Rep[_], T19 with Rep[_], T20 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20)
  }
  implicit class Tuple21ExtensionMethods[T1 <: Rep[_], T2 <: Rep[_], T3 <: Rep[_], T4 <: Rep[_], T5 <: Rep[_], T6 <: Rep[_], T7 <: Rep[_], T8 <: Rep[_], T9 <: Rep[_], T10 <: Rep[_], T11 <: Rep[_], T12 <: Rep[_], T13 <: Rep[_], T14 <: Rep[_], T15 <: Rep[_], T16 <: Rep[_], T17 <: Rep[_], T18 <: Rep[_], T19 <: Rep[_], T20 <: Rep[_], T21 <: Rep[_]](val t: (T1 with Rep[_], T2 with Rep[_], T3 with Rep[_], T4 with Rep[_], T5 with Rep[_], T6 with Rep[_], T7 with Rep[_], T8 with Rep[_], T9 with Rep[_], T10 with Rep[_], T11 with Rep[_], T12 with Rep[_], T13 with Rep[_], T14 with Rep[_], T15 with Rep[_], T16 with Rep[_], T17 with Rep[_], T18 with Rep[_], T19 with Rep[_], T20 with Rep[_], T21 with Rep[_])) extends AnyVal {
    def ~ [U <: Rep[_]](c: U with Rep[_]): (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, U) = (t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, t._21, c)
    def ~: [U <: Rep[_]](c: U with Rep[_]): (U, T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21) = (c, t._1, t._2, t._3, t._4, t._5, t._6, t._7, t._8, t._9, t._10, t._11, t._12, t._13, t._14, t._15, t._16, t._17, t._18, t._19, t._20, t._21)
  }

  /** A chained extractor for tuples */
  object ~ {
    def unapply[T1 <: Rep[_], T2 <: Rep[_]](p: (T1,T2)) =
      Some(p)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_]](p: (T1,T2,T3)) =
      Some((p._1,p._2), p._3)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_]](p: (T1,T2,T3,T4)) =
      Some((p._1,p._2,p._3), p._4)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_]](p: (T1,T2,T3,T4,T5)) =
      Some((p._1,p._2,p._3,p._4), p._5)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6)) =
      Some((p._1,p._2,p._3,p._4,p._5), p._6)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6), p._7)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7), p._8)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8), p._9)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9), p._10)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10), p._11)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11), p._12)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12), p._13)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13), p._14)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14), p._15)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15), p._16)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_],T17 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15,p._16), p._17)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_],T17 <: Rep[_],T18 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15,p._16,p._17), p._18)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_],T17 <: Rep[_],T18 <: Rep[_],T19 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15,p._16,p._17,p._18), p._19)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_],T17 <: Rep[_],T18 <: Rep[_],T19 <: Rep[_],T20 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15,p._16,p._17,p._18,p._19), p._20)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_],T17 <: Rep[_],T18 <: Rep[_],T19 <: Rep[_],T20 <: Rep[_],T21 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15,p._16,p._17,p._18,p._19,p._20), p._21)
    def unapply[T1 <: Rep[_],T2 <: Rep[_],T3 <: Rep[_],T4 <: Rep[_],T5 <: Rep[_],T6 <: Rep[_],T7 <: Rep[_],T8 <: Rep[_],T9 <: Rep[_],T10 <: Rep[_],T11 <: Rep[_],T12 <: Rep[_],T13 <: Rep[_],T14 <: Rep[_],T15 <: Rep[_],T16 <: Rep[_],T17 <: Rep[_],T18 <: Rep[_],T19 <: Rep[_],T20 <: Rep[_],T21 <: Rep[_],T22 <: Rep[_]](p: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22)) =
      Some((p._1,p._2,p._3,p._4,p._5,p._6,p._7,p._8,p._9,p._10,p._11,p._12,p._13,p._14,p._15,p._16,p._17,p._18,p._19,p._20,p._21), p._22)
  }
}

/** A Product to represent larger arities than Tuple22 */
final class ProductWrapper(val seq: IndexedSeq[Any]) extends Product {
  def productArity = seq.length
  def productElement(idx: Int) = seq(idx)
  override def productIterator = seq.iterator
  def canEqual(that: Any) = that.isInstanceOf[ProductWrapper]
  override def equals(that: Any) = that match {
    case p: ProductWrapper => productArity == p.productArity &&
      (0 until productArity).forall(i => productElement(i) == p.productElement(i))
    case _ => false
  }
  override def hashCode = seq.hashCode
  override def toString = seq.mkString("ProductWrapper(", ",", ")")
}
