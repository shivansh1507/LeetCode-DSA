import java.util.Scanner;

public class PalindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int s = 0;
        int end = a.length() - 1;
        boolean pal = true;
        while (s > end) {
            if (a.charAt(s) != a.charAt(end)) {
                pal = false;
                break;
            }
            s++;
            end--;
            if (pal == true) {
                System.out.print("The string is Palindrome");
            } else {
                System.out.print("The String is not Palindrome");
            }
        }
    }
}
