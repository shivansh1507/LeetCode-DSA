import java.util.Scanner;

public class Camelcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = " ";
        char ch;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            ch = sb.charAt(i);
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
                s1 = s1 + ch;
            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                s1 = s1 + ch;
            }
        }
        System.out.print(s1);
    }
}

// import java.util.Scanner;

// public class Camelcase {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String s = sc.nextLine();
// StringBuilder sb = new StringBuilder();

// for (int i = 0; i < s.length(); i++) {
// char ch = s.charAt(i);
// if (Character.isUpperCase(ch)) {
// ch = Character.toLowerCase(ch);
// } else if (Character.isLowerCase(ch)) {
// ch = Character.toUpperCase(ch);
// }
// sb.append(ch); // Append the modified character to the StringBuilder
// }

// System.out.println(sb.toString());
// }
// }
