import java.util.Scanner;

public class Palindromecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = s.toLowerCase();
        s1 = s.replaceAll(",?/;:!!", " ");
        StringBuilder sb = new StringBuilder(s1);
        sb.reverse();
        if (s1.equals(s)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
