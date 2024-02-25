import java.util.* ;

public class toggleCharacters {
    private static String toggle (String s) {
        
        StringBuilder updated = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++) {
            char ch = s.charAt(i) ;
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch+32);
            }
            else if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch-32) ;
            }
            updated.append(ch);
        }
        return updated.toString()  ;
    }
    public static void main (String agrs[]) {
        Scanner scanner = new Scanner (System.in);
        String word = scanner.nextLine();

        System.out.println(toggle(word));
        scanner.close();
    }
}