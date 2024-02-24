import java.util.*;

public class SumOfNaturalNumbers {

    public static int SumOfNaturalNumber (int numbers) {
        return (numbers * (numbers+1)) / 2 ;
    }

    public static void main (String agrs[]){
        Scanner scanner = new Scanner (System.in);
        int number = scanner.nextInt();

        System.out.println (SumOfNaturalNumber(number));
        scanner.close();
    }
}