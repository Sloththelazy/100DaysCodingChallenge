import java.util.*;

public class SquareRootNumber {

    public static double SquareRoot (int number) {
        if (number < 0) {
            return Double.NaN ;
        }
        double guess = number/2 ;
        double epsilon = 1e-10 ;
        while (Math.abs(guess*guess - number) > epsilon){
            // Newton-Rhapson Formula 
            guess = 0.5 * (guess + number /guess);
        }
        return guess ;
    }
    public static void main (String args []) {
        Scanner scanner= new Scanner (System.in) ; 
        int number = scanner.nextInt () ; 

        System.out.println((int) Math.floor(SquareRoot(number)));
        scanner.close();
    }
}