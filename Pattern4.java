import java.util.Scanner;

public class Pattern4 {
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numberofRows = scanner.nextInt();

        int numberofStars = numberofRows+1 ;
        int numberofSpaces = 1 ;

        for (int i = 1 ; i <= numberofRows ; i++)
        {
            for(int j = 1; j <= numberofStars/2 ; j++)
            {
                System.out.print("*");
            }
            for (int k = 1 ;k <= numberofSpaces ; k++)
            {
                System.out.print(" ");
            }
            for(int j =1; j<= numberofStars/2 ;j++)
            {
                System.out.print("*");
            }
            System.out.println();

            if (numberofRows/2 >= i)
            {
                numberofStars -= 2 ;
                numberofSpaces += 2 ;
            }
            else{
                numberofStars += 2 ;
                numberofSpaces -= 2;
            }
        }
        scanner.close();
    }
}
