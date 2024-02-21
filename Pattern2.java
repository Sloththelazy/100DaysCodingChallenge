import java.util.Scanner;
public class Pattern2{
 public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in) ;
        int numberOfRows = scanner.nextInt() ;

        int number = 1; 
        for (int i = 1 ; i <= numberOfRows ; i++)
        {
            for (int j = 1 ; j<= i ; j++) {
                System.out.print((number++) + "\t");
            }
            System.out.println();
        }

        scanner.close() ;
    }
}
