import java.util.Scanner;

public class Boolean {
    //Metoda sprawdzająca, czy liczba jest parzysta
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Metoda sprawdzająca, czy liczba jest dodatnia
    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Otrzymujemy pierwszą wartośc od użytkownika i wczytujemy je do zmiennej
        System.out.println("Type first number: ");
        int first = scanner.nextInt();

        //Otrzymujemy drugą wartośc od użytkownika i wczytujemy je do zmiennej
        System.out.println("Type second number: ");
        int second = scanner.nextInt();

        //Warunki sprawdzające różne kombinacje parzystości i znaku liczb
        if (isEven(first) && isEven(second) && isPositive(first) && isPositive(second)) {
            System.out.println("Both numbers are even and positive");
        } else if (isEven(first) && isPositive(first) && !isEven(second) && !isPositive(second)) {
            System.out.println("The first number is even and positive, and the second one is odd and negative");
        } else if (!isEven(first) && !isPositive(first) && isEven(second) && isPositive(second)) {
            System.out.println("The first number is odd and negative, and the second one is even and positive");
        } else if (isEven(first) && !isPositive(first) && isEven(second) && !isPositive(second)) {
            System.out.println("Both numbers are even and negative");
        } else if (!isEven(first) && isPositive(first) && !isEven(second) && isPositive(second)) {
            System.out.println("Both numbers are odd and positive");
        } else if (isEven(first) && isPositive(first) && isEven(second) && !isPositive(second)) {
            System.out.println("The first number is even and positive, and the second one is even and negative");
        } else if (isEven(first) && !isPositive(first) && isEven(second) && isPositive(second)) {
            System.out.println("The first number is even and negative, and the second one is even and positive");
        } else if (isEven(first) && isPositive(first) && !isEven(second) && isPositive(second)) {
            System.out.println("The first number is even and positive, and the second one is odd and positive");
        } else if (isEven(first) && isPositive(first) && isEven(second) && isPositive(second)) {
            System.out.println("Both numbers are even and positive");
        } else if (!isEven(first) && isPositive(first) && isEven(second) && isPositive(second)) {
            System.out.println("The first number is odd and positive, and the second one is even and positive");
        } else if (!isEven(first) && isPositive(first) && isEven(second) && !isPositive(second)) {
            System.out.println("The first number is odd and positive, and the second one is even and negative");
        } else if (isEven(first)) {
            System.out.println("The first number is even and negative, and the second one is odd and negative");
        } else if (isEven(second)) {
            System.out.println("The first number is odd and negative, and the second one is even and negative");
        } else if (isPositive(first)) {
            System.out.println("The first number is odd and positive, and the second one is odd and negative");
        } else if (isPositive(second)) {
            System.out.println("The first number is odd and negative, and the second one is odd and positive");
        } else {
            System.out.println("Both numbers are odd and negative");
        }
    }
}

