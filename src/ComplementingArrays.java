import java.util.Random;
public class ComplementingArrays
{
    //Metoda do uzupełniania tablicy jednowymiarowej liczbami losowymi
    public static int[] CreateOneDimensionalArray(int size) {
        int[] table = new int[size];
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            table[i] = rand.nextInt(21); // Losowa liczba z przedziału 0-20
        }

        return table;
    }

    //Metoda do uzupełniania tablicy dwuwymiarowej liczbami losowymi
    public static int[][] CreateTwoDimensionalArray(int rows, int columns) {
        int[][] table = new int[rows][columns];
        Random rand = new Random();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                table[i][j] = rand.nextInt(21); // Losowa liczba z przedziału 0-20
            }
        }
        return table;
    }

    //Metoda do wyświetlania zawartości tablicy jednowymiarowej
    public static void PrintOneDimensionalArray(int[] table) {
        for (int element : table) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    //Metoda do wyświetlania zawartości tablicy dwuwymiarowej
    public static void PrintTwoDimensionalArray(int[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Utworzamy i uzupełnieniamy tablicy jednowymiarowej
        int[] OneDimensionalArray = CreateOneDimensionalArray(20);

        //Wyświetlamy zawartości tablicy jednowymiarowej
        System.out.println("One Dimensional Array: ");
        PrintOneDimensionalArray(OneDimensionalArray);

        //Utworzamy i uzupełnieniamytablicy dwuwymiarowej
        int[][] TwoDimensionalArray= CreateTwoDimensionalArray(4,5);

        //Wyświetlamy zawartości tablicy dwuwymiarowej
        System.out.println("\nTwo Dimensional Array: ");
        PrintTwoDimensionalArray(TwoDimensionalArray);
    }
}
