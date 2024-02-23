import java.util.Scanner;


public class Factorial {
    
    private static int factorial (int numbers){
        int factorial = 1 ;
        for (int i = 1 ; i <= numbers; i++){
            factorial = factorial * i ;
        }
        return factorial ;
    }

    private static int nPr (int numbers , int r){
        int nPr = 1 ; 
        int Factorial_number = factorial(numbers);
        int Factorial_number_r = factorial(numbers - r);
        nPr = Factorial_number / Factorial_number_r ;
        
        return nPr ;
    }

    private static int nCr (int numbers , int r){
        int nCr = 1 ; 
        int Factorial_number = factorial(numbers);
        int Factorial_r = factorial(r);
        int Factorial_number_r = factorial(numbers - r);
        nCr = Factorial_number / ((Factorial_r * Factorial_number_r));
        return nCr ;
    }
    
    public static void main (String agrs[])
    {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int r = scanner.nextInt();

        System.out.println("Factorial = " + factorial(number));
        System.out.println("nPr = " + nPr(number , r));
        System.out.println("nCr = " + nCr (number , r));

        scanner.close();
    }
}
