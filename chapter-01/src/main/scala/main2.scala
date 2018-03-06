// Import the Slick interface for H2:
import slick.jdbc.H2Profile.api._

import scala.concurrent.Await
import scala.concurrent.duration._
import scala.concurrent.ExecutionContext.Implicits.global

import cats.effect.IO
import DbStuff._

object Example2 extends App {

  // Create an in-memory H2 database;
  val db = Database.forConfig("chapter01")

  def execIO[T](program: DBIO[T]): IO[T] = IO.fromFuture(IO { db.run(program) })

  def insertData: IO[Option[Int]] = execIO(messages ++= freshTestData)

  def getAllMessages: IO[Seq[Message]] = execIO(messages.result)

  def getHalsMessages: IO[Seq[Message]] = execIO(halSays.result)

  def createSchema: IO[Unit] = execIO(messages.schema.create)

  val programIO: IO[Unit] =
    for {
      _ <- IO(println("Creating database table"))
      _ <- createSchema
      _ <- insertData
      _ <- IO(println("\nSelecting all messages:"))
      m <-  getAllMessages
      _ <- IO { m.foreach (println) }
      _ <- IO(println("\nSelecting only messages from HAL:"))
      h <-  getHalsMessages
      _ <- IO { h.foreach (println) }
    } yield ()


  programIO.unsafeRunTimed(2 seconds)
}
