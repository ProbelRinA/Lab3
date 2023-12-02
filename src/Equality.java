public class Equality
{
    public static void main(String[] args)
    {
        //Inicjalizujemy zmienne typu String
        String x1 = "Zero"; //Zmienna x1 wskazuje na stałą tekstową w puli stałych
        String x2 = "Zero"; //Zmienna x2 wskazuje na tę samą stałą tekstową co x1
        String x3 = new String("Zero"); //Zmienna x3 tworzy nowy obiekt String, nie wskazuje na stałą tekstową w puli stałych
        String x4 = x2; // Zmienna x4 wskazuje na ten sam obiekt, co x2
        String x5 = x3; // Zmienna x5 wskazuje na ten sam obiekt, co x3

        //Porówniamy obiekty za pomocą operatora ==
        System.out.println(x1 == x2); //jest true, ponieważ obie zmienne wskazują na tę samą stałą tekstową w puli stałych.
        System.out.println(x1 == x3); //jest false, ponieważ x3 wskazuje na nowo utworzony obiekt String przy użyciu new, a nie na stałą tekstową w puli stałych.
        System.out.println(x1 == x4); //jest true, ponieważ x4 wskazuje na ten sam obiekt, co x2.
        System.out.println(x1 == x5); //jest false, ponieważ x5 wskazuje na nowo utworzony obiekt String przy użyciu new, a nie na stałą tekstową w puli stałych.
    }
}
