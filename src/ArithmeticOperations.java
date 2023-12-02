
public class ArithmeticOperations
{
    public static void main(String[] args)
    {

        // Pobranie dwóch pierwszych parametrów jako liczby
        double number1 = Double.valueOf(args[0]);
        double number2 = Double.valueOf(args[1]);
        double number3 = Double.valueOf(args[2]);
        double number4 = Double.valueOf(args[1]);

        // Wykonanie operacji arytmetycznych
        double sum = number1 + number2 + number3 + number4;
        double mult = number1 * number2 * number3 * number4;
        double div = number1 / number2 / number3 / number4;
        double sub = number1 - number2 - number3 - number4;

         // Wyświetlenie wyników
        System.out.println("The Addition: " + sum);
        System.out.println("The Subtraction: " + sub);
        System.out.println("The Multiplication: " + mult);
        System.out.println("The Division: " + div);

    }
}


