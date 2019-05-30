import scala.concurrent._
import scala.concurrent.duration.Duration
import scala.concurrent.{Await, Future}
import scala.util.{Success, Failure}
import ExecutionContext.Implicits.global

object Futures {
  def main(args: Array[String]) {
    val x = Future { "I'm the future value!" }
    x.onComplete {
      case Success(value) => println(s"The value is: $value")
      case Failure(e) => println("Failed")
    }
    Await.ready(x, Duration.Inf)
  }
}
