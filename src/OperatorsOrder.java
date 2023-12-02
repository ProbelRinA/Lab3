public class OperatorsOrder
{
    public static void main(String[] args)
    {
        //Inicjalizujemy zmienne
        int a = 8;
        int b = 4;
        int c = 3;

        //Utworzymy wyrażenia matematyczne z różnymi operatorami i kolejnością działań
        int result1 = a + b * c;
        int result2 = c * a + b;
        int result3 = (a + b) * c;
        int result4 = (c * a) + b;
        int result5 = a + b / c;
        int result6 = c / a + b;
        int result7 = (a + b) / c;
        int result8 = (c / a) + b;
        int result9 = a / b * c;
        int result10 = c * a / b;
        int result11 = (a / b) * c;
        int result12 = (c * a) / b;

        //Wyświetlamy wyniki
        System.out.println(result1 + "\n" + result2 + "\n" + result3 + "\n" + result4 + "\n"
                + result5 + "\n" + result6 + "\n" + result7 + "\n" + result8 + "\n" + result9 + "\n"
                + result10 + "\n" + result11 + "\n" + result12 + "\n");

    }
}
