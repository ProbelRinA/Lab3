public class Conversion
{
    public static void main(String[] args)
    {
        //Przykładowe teksty do konwersji
        String text = "123";
        String text2 = "123.43";

        //Zmienne, do których będą przypisane skonwertowane wartości
        int textint;
        long textlong;
        float textfloat;
        double textdouble;

        textint = Integer.valueOf(text); //Konwersujemy String na int
        textlong = Long.valueOf(text); //Konwersujemy String na long
        textfloat = Float.valueOf(text2); //Konwersujemy String na float
        textdouble = Double.valueOf(text2);//Konwersujemy String na double

        //Wyświetlamy wyniki konwersji
        System.out.println("Converting String: " + text + " into Int: " + textint);
        System.out.println("Converting String: " + text + " into Long: " + textlong);
        System.out.println("Converting String: " + text2 + " into Float: " + textfloat);
        System.out.println("Converting String: " + text2 + " into Double: " + textdouble);
    }
}
