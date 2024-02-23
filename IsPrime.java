import java.util.*;

public class IsPrime {
    
    public static void Prime(int number) {

        if (number <= 2) {
            System.out.println("Yay");
            System.exit(0);
        }
         
        for (int i = 2 ; i <= Math.sqrt(number) ; i++)
        {
            if (number % i == 0)
            {
                System.out.println("Nay");
                System.exit(0);
            }
        }

        System.out.println("Yay");

    }
    public static void main (String agrs[])
    {
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();
        
        Prime(number);
        scanner.close();
    }
}
