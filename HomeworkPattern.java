import java.util.Scanner;

public class HomeworkPattern {
    public static void main (String agrs [])
    { 
        Scanner scanner = new Scanner (System.in);
        int numberofRows = scanner.nextInt();

        int numberofStars = 1 ;
        int numberofSpaces = numberofRows/2 ; 
        int number = 1 ;

        for (int i = 1 ; i <= numberofRows ; i++){

            if (numberofRows / 2 + 1 >= i){
                number = i ;
            }
            else
            {
                number = numberofRows - i + 1 ;
            }
            for (int j = 0 ; j < numberofSpaces ; j++){
                System.out.print("  ");
            }

            for (int k = 0 ; k < numberofStars ; k++){
                System.out.print(number + " ");

                if (numberofStars/2 > k)
                {
                    number++ ;
                }
                else {
                    number-- ;
                }
            }
            System.out.println();

            if (numberofRows/2 >= i)
            {
                numberofStars += 2 ;
                numberofSpaces -= 1;
            }
            else{
                numberofStars -= 2 ;
                numberofSpaces += 1 ;
            }
        }
        scanner.close();
    }
}