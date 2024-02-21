import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Pattern1{

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numberOfRows = scanner.nextInt();
        
      for(int i = 0 ; i < numberOfRows ; i++)
      {
        for (int j = 0 ; j <= i ; j++){
          System.out.print("* ");
        }
        System.out.println();
      }
      scanner.close();
    }
}