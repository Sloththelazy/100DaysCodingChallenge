import java.util.*;
import java.math.*;

public class NumberOfFactors {

    public static int Factors (int number) {
        int factor = 1 ;
        for (int i = 1 ; i <= number/2 ; i++){
            if (number % i == 0) {
                factor++ ;
            }
        }
        return factor ;
    }
    public static void main (String agrs[]){
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();

       System.out.println(Factors(number));
       scanner.close();
    }
}
