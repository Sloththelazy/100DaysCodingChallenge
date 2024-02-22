import java.util.Scanner;

public class Pattern3 {

    public static void main (String agrs[] )
    {
        Scanner scanner = new Scanner (System.in);
        int numberofRows = scanner.nextInt() ;

        int numberofStars = 1 ;
        int numberofSpaces = numberofRows/2 ;

        for(int i = 1 ; i <= numberofRows ; i++){

            for(int j = 1 ; j <= numberofSpaces ; j++){
                System.out.print(" ");
            }
            for (int k = 1 ; k <= numberofStars ; k++)
            {
                System.out.print("*");
            }
            System.out.println();

            if(numberofRows/2 >= i){
                numberofStars += 2 ;
                numberofSpaces -= 1 ;
            }
            else
            {
                numberofStars -= 2;
                numberofSpaces += 1 ;
            }


        }
        scanner.close();
    }
}