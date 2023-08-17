import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // char ch;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            char ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                System.out.println(ch + " Letter is Upper Case");
            } else {
                System.out.println(ch + " is not a UpperCase letter");
            }
        }
    }
}