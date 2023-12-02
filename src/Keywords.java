public class Keywords
{
    public static void main(String[] args)
    {
        //Tworzymy pętlą zewnętrzną z etykietą "outerLoop"
        outerLoop:
        for(int i = 0; i <= 7; i++) {
            for(int j = 0; j <= 7; j++){
                System.out.println(i + " " + j);
                if (i == 5){
                    break outerLoop; //Warunek przerwania pętli
                }
            }
        }

        System.out.println("\n\n");

        //Tworzymy pętlą bez etykiety
        for(int i = 0; i <= 5; i++) {
            for(int j = 0; j <= 3; j++){
                if (i == 4){
                   continue;//Warunek pominięcia reszty iteracji
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
