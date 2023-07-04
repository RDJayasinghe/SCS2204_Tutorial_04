import scala.io.StdIn.{readInt}
object q2{

    def PatternMatching(N: Int): String = {
    N match {

        case d if N <= 0 =>
        "Negative/Zero"
        case d if N%2 == 0 =>
        "Even"
        case _ =>
        "Odd"
    }
    }

    def main(args: Array[String]): Unit = {

        print("Enter Number: ");
        val Number = readInt();
        println(Number +" is "+ PatternMatching(Number) );

    }

}