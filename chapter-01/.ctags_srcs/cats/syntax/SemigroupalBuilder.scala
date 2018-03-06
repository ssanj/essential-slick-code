// auto-generated boilerplate
package cats
package syntax



@deprecated("replaced by apply syntax", "1.0.0-MF")
private[syntax] final class SemigroupalBuilder[F[_]] {
  def |@|[A](a: F[A]) = new SemigroupalBuilder1(a)

  private[syntax] final class SemigroupalBuilder1[A0](a0:F[A0]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder2(a0, z)
    def apWith[Z](f: F[(A0) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap(f)(a0)
    def map[Z](f: (A0) => Z)(implicit functor: Functor[F]): F[Z] = functor.map(a0)(f)
    def contramap[Z](f: Z => (A0))(implicit contravariant: Contravariant[F]): F[Z] = contravariant.contramap(a0)(f)
    def imap[Z](f: (A0) => Z)(g: Z => (A0))(implicit invariant: Invariant[F]): F[Z] = invariant.imap(a0)(f)(g)
    
 }
  private[syntax] final class SemigroupalBuilder2[A0, A1](a0:F[A0], a1:F[A1]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder3(a0, a1, z)
    def apWith[Z](f: F[(A0, A1) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap2(f)(a0, a1)
    def map[Z](f: (A0, A1) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map2(a0, a1)(f)
    def contramap[Z](f: Z => (A0, A1))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap2(a0, a1)(f)
    def imap[Z](f: (A0, A1) => Z)(g: Z => (A0, A1))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap2(a0, a1)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1)] = Semigroupal.tuple2(a0, a1)
 }
  private[syntax] final class SemigroupalBuilder3[A0, A1, A2](a0:F[A0], a1:F[A1], a2:F[A2]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder4(a0, a1, a2, z)
    def apWith[Z](f: F[(A0, A1, A2) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap3(f)(a0, a1, a2)
    def map[Z](f: (A0, A1, A2) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map3(a0, a1, a2)(f)
    def contramap[Z](f: Z => (A0, A1, A2))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap3(a0, a1, a2)(f)
    def imap[Z](f: (A0, A1, A2) => Z)(g: Z => (A0, A1, A2))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap3(a0, a1, a2)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2)] = Semigroupal.tuple3(a0, a1, a2)
 }
  private[syntax] final class SemigroupalBuilder4[A0, A1, A2, A3](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder5(a0, a1, a2, a3, z)
    def apWith[Z](f: F[(A0, A1, A2, A3) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap4(f)(a0, a1, a2, a3)
    def map[Z](f: (A0, A1, A2, A3) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map4(a0, a1, a2, a3)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap4(a0, a1, a2, a3)(f)
    def imap[Z](f: (A0, A1, A2, A3) => Z)(g: Z => (A0, A1, A2, A3))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap4(a0, a1, a2, a3)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3)] = Semigroupal.tuple4(a0, a1, a2, a3)
 }
  private[syntax] final class SemigroupalBuilder5[A0, A1, A2, A3, A4](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder6(a0, a1, a2, a3, a4, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap5(f)(a0, a1, a2, a3, a4)
    def map[Z](f: (A0, A1, A2, A3, A4) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map5(a0, a1, a2, a3, a4)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap5(a0, a1, a2, a3, a4)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4) => Z)(g: Z => (A0, A1, A2, A3, A4))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap5(a0, a1, a2, a3, a4)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4)] = Semigroupal.tuple5(a0, a1, a2, a3, a4)
 }
  private[syntax] final class SemigroupalBuilder6[A0, A1, A2, A3, A4, A5](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder7(a0, a1, a2, a3, a4, a5, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap6(f)(a0, a1, a2, a3, a4, a5)
    def map[Z](f: (A0, A1, A2, A3, A4, A5) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map6(a0, a1, a2, a3, a4, a5)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap6(a0, a1, a2, a3, a4, a5)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5) => Z)(g: Z => (A0, A1, A2, A3, A4, A5))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap6(a0, a1, a2, a3, a4, a5)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5)] = Semigroupal.tuple6(a0, a1, a2, a3, a4, a5)
 }
  private[syntax] final class SemigroupalBuilder7[A0, A1, A2, A3, A4, A5, A6](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder8(a0, a1, a2, a3, a4, a5, a6, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap7(f)(a0, a1, a2, a3, a4, a5, a6)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map7(a0, a1, a2, a3, a4, a5, a6)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap7(a0, a1, a2, a3, a4, a5, a6)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap7(a0, a1, a2, a3, a4, a5, a6)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6)] = Semigroupal.tuple7(a0, a1, a2, a3, a4, a5, a6)
 }
  private[syntax] final class SemigroupalBuilder8[A0, A1, A2, A3, A4, A5, A6, A7](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder9(a0, a1, a2, a3, a4, a5, a6, a7, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap8(f)(a0, a1, a2, a3, a4, a5, a6, a7)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map8(a0, a1, a2, a3, a4, a5, a6, a7)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap8(a0, a1, a2, a3, a4, a5, a6, a7)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap8(a0, a1, a2, a3, a4, a5, a6, a7)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7)] = Semigroupal.tuple8(a0, a1, a2, a3, a4, a5, a6, a7)
 }
  private[syntax] final class SemigroupalBuilder9[A0, A1, A2, A3, A4, A5, A6, A7, A8](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder10(a0, a1, a2, a3, a4, a5, a6, a7, a8, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap9(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map9(a0, a1, a2, a3, a4, a5, a6, a7, a8)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap9(a0, a1, a2, a3, a4, a5, a6, a7, a8)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap9(a0, a1, a2, a3, a4, a5, a6, a7, a8)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8)] = Semigroupal.tuple9(a0, a1, a2, a3, a4, a5, a6, a7, a8)
 }
  private[syntax] final class SemigroupalBuilder10[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder11(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap10(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map10(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap10(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap10(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9)] = Semigroupal.tuple10(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9)
 }
  private[syntax] final class SemigroupalBuilder11[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder12(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap11(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map11(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap11(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap11(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10)] = Semigroupal.tuple11(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)
 }
  private[syntax] final class SemigroupalBuilder12[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder13(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap12(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map12(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap12(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap12(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11)] = Semigroupal.tuple12(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11)
 }
  private[syntax] final class SemigroupalBuilder13[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder14(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap13(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map13(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap13(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap13(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12)] = Semigroupal.tuple13(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12)
 }
  private[syntax] final class SemigroupalBuilder14[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder15(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap14(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map14(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap14(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap14(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13)] = Semigroupal.tuple14(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13)
 }
  private[syntax] final class SemigroupalBuilder15[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder16(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap15(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map15(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap15(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap15(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14)] = Semigroupal.tuple15(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14)
 }
  private[syntax] final class SemigroupalBuilder16[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder17(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap16(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map16(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap16(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap16(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15)] = Semigroupal.tuple16(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15)
 }
  private[syntax] final class SemigroupalBuilder17[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15], a16:F[A16]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder18(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap17(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map17(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap17(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap17(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16)] = Semigroupal.tuple17(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16)
 }
  private[syntax] final class SemigroupalBuilder18[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15], a16:F[A16], a17:F[A17]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder19(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap18(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map18(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap18(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap18(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17)] = Semigroupal.tuple18(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17)
 }
  private[syntax] final class SemigroupalBuilder19[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15], a16:F[A16], a17:F[A17], a18:F[A18]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder20(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap19(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map19(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap19(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap19(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18)] = Semigroupal.tuple19(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18)
 }
  private[syntax] final class SemigroupalBuilder20[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15], a16:F[A16], a17:F[A17], a18:F[A18], a19:F[A19]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder21(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap20(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map20(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap20(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap20(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19)] = Semigroupal.tuple20(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19)
 }
  private[syntax] final class SemigroupalBuilder21[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15], a16:F[A16], a17:F[A17], a18:F[A18], a19:F[A19], a20:F[A20]) {
    def |@|[Z](z: F[Z]) = new SemigroupalBuilder22(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, z)
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap21(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map21(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap21(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap21(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20)] = Semigroupal.tuple21(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20)
 }
  private[syntax] final class SemigroupalBuilder22[A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21](a0:F[A0], a1:F[A1], a2:F[A2], a3:F[A3], a4:F[A4], a5:F[A5], a6:F[A6], a7:F[A7], a8:F[A8], a9:F[A9], a10:F[A10], a11:F[A11], a12:F[A12], a13:F[A13], a14:F[A14], a15:F[A15], a16:F[A16], a17:F[A17], a18:F[A18], a19:F[A19], a20:F[A20], a21:F[A21]) {
    
    def apWith[Z](f: F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => Z])(implicit apply: Apply[F]): F[Z] = apply.ap22(f)(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21)
    def map[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => Z)(implicit functor: Functor[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.map22(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21)(f)
    def contramap[Z](f: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21))(implicit contravariant: Contravariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.contramap22(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21)(f)
    def imap[Z](f: (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21) => Z)(g: Z => (A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21))(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[Z] = Semigroupal.imap22(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21)(f)(g)
    def tupled(implicit invariant: Invariant[F], semigroupal: Semigroupal[F]): F[(A0, A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, A21)] = Semigroupal.tuple22(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21)
 }
}