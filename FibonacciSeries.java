import java.util.*;


public class FibonacciSeries {

    private static Map <Integer, Integer> memo = new HashMap<> ();
    public static int Fibonacci (int term) {
        if (term == 0) {
            return 0 ;
        }
        else if(term == 1) {
            return 1;
        }
        else if (memo.containsKey(term)) {
            memo.get(term);
        }

        int result = Fibonacci(term-1) + Fibonacci(term-2);
        memo.put(term, result);
        return result;
    }
    public static void main (String agrs[]) {
        Scanner scanner = new Scanner (System.in);
        int term = scanner.nextInt();

        System.out.println(Fibonacci(term));
        scanner.close();
    }
}