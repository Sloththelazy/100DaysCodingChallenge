import java.util.Scanner ; 

public class reverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        int copy = number ;
        int reverse = 0 ;

        while (number != 0)
        {
            int digit = number % 10 ; 
            reverse = (reverse * 10) + digit ; 
            number /= 10;
        }

        System.out.println(reverse);
        scanner.close();
    }
}