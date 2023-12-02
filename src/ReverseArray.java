public class ReverseArray
{
    public static void main(String[] args)
    {
        //Deklarujemy i inicjalizujemy tablicą
        int[] array = {15,23,47,59,71,83};

        System.out.println("Normal Array: ");

        //Pętla do wyświetlenia tablicy
        for(int i=0; i<array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println("\nReversed Array:");

        //Pętla do wyświetlenia tablicy w odwróconym porządku
        for(int i=array.length-1;i>=0;i--)
            System.out.print(array[i] + " ");
    }
}
