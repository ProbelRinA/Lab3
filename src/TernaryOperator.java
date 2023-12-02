import java.util.Scanner;
public class TernaryOperator
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Otrzymujemy wartości od użytkownika i wczytujemy je do zmiennej
        System.out.print("Type a number: ");
        float number = scanner.nextFloat();

        //Sprawdzamy parzystośc i znak liczby
        if (number % 2 == 0 && number > 0) {
            System.out.print("It's an even and positive number");//Czy liczba jest parzysta i dodatnia.
        } else if ((number % 2 == 0 && number < 0))
        {
            System.out.print("It's an even and negative number");//Czy liczba jest parzysta i ujemna.
        }
        else if (number %2 != 0 && number < 0)
        {
            System.out.print("It's an odd and negative number");//Czy liczba jest nieparzysta i ujemna.
        } else if (number %2 != 0 && number > 0)
        {
            System.out.print("It's an odd and positive number");//Czy liczba jest nieparzysta i dodatnia.
        } else
        {
            System.out.print("It's a zero");//Czy liczba jest równa zero.
        }
    }
}
