import java.util.*;


public class BitEven {
    private static void EvenChecker( long n) {
        
       long number = n ;
        
        if ((number & 0x01) == 0){
            System.out.println("even");
        }
        else if ( number < 0) {
            System.out.println("even");
        }
        else
        {
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        long n = scanner.nextLong();
        
        EvenChecker(n);
        scanner.close();
    }
}