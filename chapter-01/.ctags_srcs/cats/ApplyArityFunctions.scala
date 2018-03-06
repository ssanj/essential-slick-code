// auto-generated boilerplate
package cats

/**
 * @groupprio Ungrouped 0
 *
 * @groupname ApArity ap arity
 * @groupdesc ApArity Higher-arity ap methods
 * @groupprio ApArity 999
 *
 * @groupname MapArity map arity
 * @groupdesc MapArity Higher-arity map methods
 * @groupprio MapArity 999
 *
 * @groupname TupleArity tuple arity
 * @groupdesc TupleArity Higher-arity tuple methods
 * @groupprio TupleArity 999
 */
trait ApplyArityFunctions[F[_]] { self: Apply[F] =>
  def tuple2[A, B](f1: F[A], f2: F[B]): F[(A, B)] = Semigroupal.tuple2(f1, f2)(self, self)
  /** @group ApArity */
  def ap3[A0, A1, A2, Z](f: F[(A0, A1, A2) => Z])(f0:F[A0], f1:F[A1], f2:F[A2]):F[Z] = 
    ap2(ap(map(f)(f =>
      (a0:A0) => (a1:A1,a2:A2) => f(a0,a1,a2)
    ))(f0))(f1,f2)
  /** @group MapArity */
  def map3[A0, A1, A2, Z](f0:F[A0], f1:F[A1], f2:F[A2])(f: (A0, A1, A2) => Z): F[Z] = Semigroupal.map3(f0:F[A0], f1:F[A1], f2:F[A2])(f)(self, self)
  /** @group TupleArity */
  def tuple3[A0, A1, A2, Z](f0:F[A0], f1:F[A1], f2:F[A2]): F[(A0, A1, A2)] = Semigroupal.tuple3(f0:F[A0], f1:F[A1], f2:F[A2])(self, self)
  /** @group ApArity */
  def ap4[A0, A1, A2, A3, Z](f: F[(A0, A1, A2, A3) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3]):F[Z] = 
    ap2(ap2(map(f)(f =>
      (a0:A0,a1:A1) => (a2:A2,a3:A3) => f(a0,a1,a2,a3)
    ))(f0,f1))(f2,f3)
  /** @group MapArity */
  def map4[A0, A1, A2, A3, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3])(f: (A0, A1, A2, A3) => Z): F[Z] = Semigroupal.map4(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3])(f)(self, self)
  /** @group TupleArity */
  def tuple4[A0, A1, A2, A3, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3]): F[(A0, A1, A2, A3)] = Semigroupal.tuple4(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3])(self, self)
  /** @group ApArity */
  def ap5[A0, A1, A2, A3, A4, Z](f: F[(A0, A1, A2, A3, A4) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4]):F[Z] = 
    ap3(ap2(map(f)(f =>
      (a0:A0,a1:A1) => (a2:A2,a3:A3,a4:A4) => f(a0,a1,a2,a3,a4)
    ))(f0,f1))(f2,f3,f4)
  /** @group MapArity */
  def map5[A0, A1, A2, A3, A4, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4])(f: (A0, A1, A2, A3, A4) => Z): F[Z] = Semigroupal.map5(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4])(f)(self, self)
  /** @group TupleArity */
  def tuple5[A0, A1, A2, A3, A4, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4]): F[(A0, A1, A2, A3, A4)] = Semigroupal.tuple5(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4])(self, self)
  /** @group ApArity */
  def ap6[A0, A1, A2, A3, A4, A5, Z](f: F[(A0, A1, A2, A3, A4, A5) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5]):F[Z] = 
    ap3(ap3(map(f)(f =>
      (a0:A0,a1:A1,a2:A2) => (a3:A3,a4:A4,a5:A5) => f(a0,a1,a2,a3,a4,a5)
    ))(f0,f1,f2))(f3,f4,f5)
  /** @group MapArity */
  def map6[A0, A1, A2, A3, A4, A5, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5])(f: (A0, A1, A2, A3, A4, A5) => Z): F[Z] = Semigroupal.map6(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5])(f)(self, self)
  /** @group TupleArity */
  def tuple6[A0, A1, A2, A3, A4, A5, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5]): F[(A0, A1, A2, A3, A4, A5)] = Semigroupal.tuple6(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5])(self, self)
  /** @group ApArity */
  def ap7[A0, A1, A2, A3, A4, A5, A6, Z](f: F[(A0, A1, A2, A3, A4, A5, A6) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6]):F[Z] = 
    ap4(ap3(map(f)(f =>
      (a0:A0,a1:A1,a2:A2) => (a3:A3,a4:A4,a5:A5,a6:A6) => f(a0,a1,a2,a3,a4,a5,a6)
    ))(f0,f1,f2))(f3,f4,f5,f6)
  /** @group MapArity */
  def map7[A0, A1, A2, A3, A4, A5, A6, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6])(f: (A0, A1, A2, A3, A4, A5, A6) => Z): F[Z] = Semigroupal.map7(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6])(f)(self, self)
  /** @group TupleArity */
  def tuple7[A0, A1, A2, A3, A4, A5, A6, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6]): F[(A0, A1, A2, A3, A4, A5, A6)] = Semigroupal.tuple7(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6])(self, self)
  /** @group ApArity */
  def ap8[A0, A1, A2, A3, A4, A5, A6, A7, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7]):F[Z] = 
    ap4(ap4(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3) => (a4:A4,a5:A5,a6:A6,a7:A7) => f(a0,a1,a2,a3,a4,a5,a6,a7)
    ))(f0,f1,f2,f3))(f4,f5,f6,f7)
  /** @group MapArity */
  def map8[A0, A1, A2, A3, A4, A5, A6, A7, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7])(f: (A0, A1, A2, A3, A4, A5, A6, A7) => Z): F[Z] = Semigroupal.map8(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7])(f)(self, self)
  /** @group TupleArity */
  def tuple8[A0, A1, A2, A3, A4, A5, A6, A7, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7]): F[(A0, A1, A2, A3, A4, A5, A6, A7)] = Semigroupal.tuple8(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7])(self, self)
  /** @group ApArity */
  def ap9[A0, A1, A2, A3, A4, A5, A6, A7, A8, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8]):F[Z] = 
    ap5(ap4(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3) => (a4:A4,a5:A5,a6:A6,a7:A7,a8:A8) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8)
    ))(f0,f1,f2,f3))(f4,f5,f6,f7,f8)
  /** @group MapArity */
  def map9[A0, A1, A2, A3, A4, A5, A6, A7, A8, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8) => Z): F[Z] = Semigroupal.map9(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8])(f)(self, self)
  /** @group TupleArity */
  def tuple9[A0, A1, A2, A3, A4, A5, A6, A7, A8, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Semigroupal.tuple9(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8])(self, self)
  /** @group ApArity */
  def ap10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9]):F[Z] = 
    ap5(ap5(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4) => (a5:A5,a6:A6,a7:A7,a8:A8,a9:A9) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9)
    ))(f0,f1,f2,f3,f4))(f5,f6,f7,f8,f9)
  /** @group MapArity */
  def map10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9) => Z): F[Z] = Semigroupal.map10(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9])(f)(self, self)
  /** @group TupleArity */
  def tuple10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Semigroupal.tuple10(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9])(self, self)
  /** @group ApArity */
  def ap11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10]):F[Z] = 
    ap6(ap5(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4) => (a5:A5,a6:A6,a7:A7,a8:A8,a9:A9,a10:A10) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10)
    ))(f0,f1,f2,f3,f4))(f5,f6,f7,f8,f9,f10)
  /** @group MapArity */
  def map11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => Z): F[Z] = Semigroupal.map11(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10])(f)(self, self)
  /** @group TupleArity */
  def tuple11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Semigroupal.tuple11(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10])(self, self)
  /** @group ApArity */
  def ap12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11]):F[Z] = 
    ap6(ap6(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5) => (a6:A6,a7:A7,a8:A8,a9:A9,a10:A10,a11:A11) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11)
    ))(f0,f1,f2,f3,f4,f5))(f6,f7,f8,f9,f10,f11)
  /** @group MapArity */
  def map12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => Z): F[Z] = Semigroupal.map12(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11])(f)(self, self)
  /** @group TupleArity */
  def tuple12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Semigroupal.tuple12(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11])(self, self)
  /** @group ApArity */
  def ap13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12]):F[Z] = 
    ap7(ap6(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5) => (a6:A6,a7:A7,a8:A8,a9:A9,a10:A10,a11:A11,a12:A12) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12)
    ))(f0,f1,f2,f3,f4,f5))(f6,f7,f8,f9,f10,f11,f12)
  /** @group MapArity */
  def map13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => Z): F[Z] = Semigroupal.map13(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12])(f)(self, self)
  /** @group TupleArity */
  def tuple13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Semigroupal.tuple13(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12])(self, self)
  /** @group ApArity */
  def ap14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13]):F[Z] = 
    ap7(ap7(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6) => (a7:A7,a8:A8,a9:A9,a10:A10,a11:A11,a12:A12,a13:A13) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13)
    ))(f0,f1,f2,f3,f4,f5,f6))(f7,f8,f9,f10,f11,f12,f13)
  /** @group MapArity */
  def map14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => Z): F[Z] = Semigroupal.map14(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13])(f)(self, self)
  /** @group TupleArity */
  def tuple14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Semigroupal.tuple14(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13])(self, self)
  /** @group ApArity */
  def ap15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14]):F[Z] = 
    ap8(ap7(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6) => (a7:A7,a8:A8,a9:A9,a10:A10,a11:A11,a12:A12,a13:A13,a14:A14) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14)
    ))(f0,f1,f2,f3,f4,f5,f6))(f7,f8,f9,f10,f11,f12,f13,f14)
  /** @group MapArity */
  def map15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => Z): F[Z] = Semigroupal.map15(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14])(f)(self, self)
  /** @group TupleArity */
  def tuple15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Semigroupal.tuple15(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14])(self, self)
  /** @group ApArity */
  def ap16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15]):F[Z] = 
    ap8(ap8(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7) => (a8:A8,a9:A9,a10:A10,a11:A11,a12:A12,a13:A13,a14:A14,a15:A15) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15)
    ))(f0,f1,f2,f3,f4,f5,f6,f7))(f8,f9,f10,f11,f12,f13,f14,f15)
  /** @group MapArity */
  def map16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => Z): F[Z] = Semigroupal.map16(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15])(f)(self, self)
  /** @group TupleArity */
  def tuple16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Semigroupal.tuple16(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15])(self, self)
  /** @group ApArity */
  def ap17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16]):F[Z] = 
    ap9(ap8(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7) => (a8:A8,a9:A9,a10:A10,a11:A11,a12:A12,a13:A13,a14:A14,a15:A15,a16:A16) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16)
    ))(f0,f1,f2,f3,f4,f5,f6,f7))(f8,f9,f10,f11,f12,f13,f14,f15,f16)
  /** @group MapArity */
  def map17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => Z): F[Z] = Semigroupal.map17(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16])(f)(self, self)
  /** @group TupleArity */
  def tuple17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Semigroupal.tuple17(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16])(self, self)
  /** @group ApArity */
  def ap18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17]):F[Z] = 
    ap9(ap9(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7,a8:A8) => (a9:A9,a10:A10,a11:A11,a12:A12,a13:A13,a14:A14,a15:A15,a16:A16,a17:A17) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17)
    ))(f0,f1,f2,f3,f4,f5,f6,f7,f8))(f9,f10,f11,f12,f13,f14,f15,f16,f17)
  /** @group MapArity */
  def map18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => Z): F[Z] = Semigroupal.map18(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17])(f)(self, self)
  /** @group TupleArity */
  def tuple18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Semigroupal.tuple18(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17])(self, self)
  /** @group ApArity */
  def ap19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18]):F[Z] = 
    ap10(ap9(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7,a8:A8) => (a9:A9,a10:A10,a11:A11,a12:A12,a13:A13,a14:A14,a15:A15,a16:A16,a17:A17,a18:A18) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18)
    ))(f0,f1,f2,f3,f4,f5,f6,f7,f8))(f9,f10,f11,f12,f13,f14,f15,f16,f17,f18)
  /** @group MapArity */
  def map19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => Z): F[Z] = Semigroupal.map19(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18])(f)(self, self)
  /** @group TupleArity */
  def tuple19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Semigroupal.tuple19(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18])(self, self)
  /** @group ApArity */
  def ap20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19]):F[Z] = 
    ap10(ap10(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7,a8:A8,a9:A9) => (a10:A10,a11:A11,a12:A12,a13:A13,a14:A14,a15:A15,a16:A16,a17:A17,a18:A18,a19:A19) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19)
    ))(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9))(f10,f11,f12,f13,f14,f15,f16,f17,f18,f19)
  /** @group MapArity */
  def map20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => Z): F[Z] = Semigroupal.map20(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19])(f)(self, self)
  /** @group TupleArity */
  def tuple20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Semigroupal.tuple20(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19])(self, self)
  /** @group ApArity */
  def ap21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20]):F[Z] = 
    ap11(ap10(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7,a8:A8,a9:A9) => (a10:A10,a11:A11,a12:A12,a13:A13,a14:A14,a15:A15,a16:A16,a17:A17,a18:A18,a19:A19,a20:A20) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20)
    ))(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9))(f10,f11,f12,f13,f14,f15,f16,f17,f18,f19,f20)
  /** @group MapArity */
  def map21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => Z): F[Z] = Semigroupal.map21(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20])(f)(self, self)
  /** @group TupleArity */
  def tuple21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Semigroupal.tuple21(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20])(self, self)
  /** @group ApArity */
  def ap22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => Z])(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20], f21:F[A21]):F[Z] = 
    ap11(ap11(map(f)(f =>
      (a0:A0,a1:A1,a2:A2,a3:A3,a4:A4,a5:A5,a6:A6,a7:A7,a8:A8,a9:A9,a10:A10) => (a11:A11,a12:A12,a13:A13,a14:A14,a15:A15,a16:A16,a17:A17,a18:A18,a19:A19,a20:A20,a21:A21) => f(a0,a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21)
    ))(f0,f1,f2,f3,f4,f5,f6,f7,f8,f9,f10))(f11,f12,f13,f14,f15,f16,f17,f18,f19,f20,f21)
  /** @group MapArity */
  def map22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20], f21:F[A21])(f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => Z): F[Z] = Semigroupal.map22(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20], f21:F[A21])(f)(self, self)
  /** @group TupleArity */
  def tuple22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21, Z](f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20], f21:F[A21]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Semigroupal.tuple22(f0:F[A0], f1:F[A1], f2:F[A2], f3:F[A3], f4:F[A4], f5:F[A5], f6:F[A6], f7:F[A7], f8:F[A8], f9:F[A9], f10:F[A10], f11:F[A11], f12:F[A12], f13:F[A13], f14:F[A14], f15:F[A15], f16:F[A16], f17:F[A17], f18:F[A18], f19:F[A19], f20:F[A20], f21:F[A21])(self, self)
}