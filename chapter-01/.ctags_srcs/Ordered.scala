package slick.lifted

import scala.language.implicitConversions
import slick.ast.{Ordering, Node}

class Ordered(val columns: IndexedSeq[(Node, Ordering)])

object Ordered {
 implicit def tuple2Ordered[T1 , T2 ](t: (T1, T2))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns)

 implicit def tuple3Ordered[T1 , T2 , T3 ](t: (T1, T2, T3))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns)

 implicit def tuple4Ordered[T1 , T2 , T3 , T4 ](t: (T1, T2, T3, T4))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns)

 implicit def tuple5Ordered[T1 , T2 , T3 , T4 , T5 ](t: (T1, T2, T3, T4, T5))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns)

 implicit def tuple6Ordered[T1 , T2 , T3 , T4 , T5 , T6 ](t: (T1, T2, T3, T4, T5, T6))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns)

 implicit def tuple7Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 ](t: (T1, T2, T3, T4, T5, T6, T7))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns)

 implicit def tuple8Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 ](t: (T1, T2, T3, T4, T5, T6, T7, T8))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns)

 implicit def tuple9Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns)

 implicit def tuple10Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns)

 implicit def tuple11Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns)

 implicit def tuple12Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns)

 implicit def tuple13Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns)

 implicit def tuple14Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns)

 implicit def tuple15Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns)

 implicit def tuple16Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns)

 implicit def tuple17Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 , T17 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered, ev17: T17 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns ++ t._17.columns)

 implicit def tuple18Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 , T17 , T18 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered, ev17: T17 => Ordered, ev18: T18 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns ++ t._17.columns ++ t._18.columns)

 implicit def tuple19Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 , T17 , T18 , T19 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered, ev17: T17 => Ordered, ev18: T18 => Ordered, ev19: T19 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns ++ t._17.columns ++ t._18.columns ++ t._19.columns)

 implicit def tuple20Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 , T17 , T18 , T19 , T20 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered, ev17: T17 => Ordered, ev18: T18 => Ordered, ev19: T19 => Ordered, ev20: T20 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns ++ t._17.columns ++ t._18.columns ++ t._19.columns ++ t._20.columns)

 implicit def tuple21Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 , T17 , T18 , T19 , T20 , T21 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered, ev17: T17 => Ordered, ev18: T18 => Ordered, ev19: T19 => Ordered, ev20: T20 => Ordered, ev21: T21 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns ++ t._17.columns ++ t._18.columns ++ t._19.columns ++ t._20.columns ++ t._21.columns)

 implicit def tuple22Ordered[T1 , T2 , T3 , T4 , T5 , T6 , T7 , T8 , T9 , T10 , T11 , T12 , T13 , T14 , T15 , T16 , T17 , T18 , T19 , T20 , T21 , T22 ](t: (T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19, T20, T21, T22))
    (implicit ev1: T1 => Ordered, ev2: T2 => Ordered, ev3: T3 => Ordered, ev4: T4 => Ordered, ev5: T5 => Ordered, ev6: T6 => Ordered, ev7: T7 => Ordered, ev8: T8 => Ordered, ev9: T9 => Ordered, ev10: T10 => Ordered, ev11: T11 => Ordered, ev12: T12 => Ordered, ev13: T13 => Ordered, ev14: T14 => Ordered, ev15: T15 => Ordered, ev16: T16 => Ordered, ev17: T17 => Ordered, ev18: T18 => Ordered, ev19: T19 => Ordered, ev20: T20 => Ordered, ev21: T21 => Ordered, ev22: T22 => Ordered): Ordered =
    new Ordered(t._1.columns ++ t._2.columns ++ t._3.columns ++ t._4.columns ++ t._5.columns ++ t._6.columns ++ t._7.columns ++ t._8.columns ++ t._9.columns ++ t._10.columns ++ t._11.columns ++ t._12.columns ++ t._13.columns ++ t._14.columns ++ t._15.columns ++ t._16.columns ++ t._17.columns ++ t._18.columns ++ t._19.columns ++ t._20.columns ++ t._21.columns ++ t._22.columns)

}

/** A `Column` with an associated `Ordering`. */
case class ColumnOrdered[T](column: Rep[T], ord: Ordering) extends Ordered(Vector((column.toNode, ord))) {
  def asc = copy(ord = ord.asc)
  def desc = copy(ord = ord.desc)
  def reverse = copy(ord = ord.reverse)
  def nullsDefault = copy(ord = ord.nullsDefault)
  def nullsFirst = copy(ord = ord.nullsFirst)
  def nullsLast = copy(ord = ord.nullsLast)
}
