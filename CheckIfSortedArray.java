import java.util.*;

public class CheckIfSortedArray {

    public static boolean CheckingSortedArray (int [] arr) {
        int size = arr.length ;
        int count = 0 ;

        for (int i = 1 ; i < size ; i++) {
            if (arr[i-1] > arr[i]) {
                count++;
            }
        }

        if (arr[0] < arr[size - 1]) {
            count++;
        }

        return count<=1 ;
    }

    public static void main (String agrs[]) {
        Scanner scanner = new Scanner (System.in);
        int sizeOfArray = scanner.nextInt();

        int [] array = new int[sizeOfArray];
        for (int i = 0 ; i < sizeOfArray ; i++)
        {
            array[i] = scanner.nextInt();
        }

        System.out.println(CheckingSortedArray(array));
        scanner.close();
    }
}