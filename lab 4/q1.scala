import scala.io.StdIn.{readInt}
object q1{

    def Interest(deposit: Double): Double = {
    deposit match {

        case d if d <= 20000 =>
        d * 0.02
        case d if d <= 200000 =>
        d * 0.04
        case d if d <= 2000000 =>
        d * 0.035
        case d =>
        d * 0.065
    }
    }

    def main(args: Array[String]): Unit = {

        print("Enter how much money do you have in account: ");
        val money = readInt();
        println("Interest: "+ Interest(money) );

    }

}