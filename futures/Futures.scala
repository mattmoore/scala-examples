import scala.concurrent._
import scala.concurrent.Future
import scala.util.{Success, Failure}
import ExecutionContext.Implicits.global

object Futures {
  def main(args: Array[String]) {
    successfulFutures
    println("Should see no futures print out past here.")
    failedFutures
  }

  def successfulFutures {
    val x = Future { "x future value" }
    val y = Future { "y future value" }
    val z = Future { "z future value" }
    for {
      xValue <- x
      yValue <- y
      zValue <- z
    } yield {
      // All of these futures are successful so we'll see them print out.
      println(xValue)
      println(yValue)
      println(zValue)
    }
  }

  def failedFutures {
    val x = Future { "x future value" }
    // This future will fail
    val y = Future { throw new Exception("y future value") }
    val z = Future { "z future value" }
    for {
      xValue <- x
      yValue <- y
      zValue <- z
    } yield {
      // Because the y future failed, none of these will print.
      // The for comprehension requires complete success accross all futures.
      println(xValue)
      println(yValue)
      println(zValue)
    }
  }
}
