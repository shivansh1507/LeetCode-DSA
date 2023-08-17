import java.util.Stack;
import java.util.Scanner;

public class ReverseStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> rev = new Stack<>();
        String s1 = " ";
        for (int i = 0; i < s.length(); i++) {
            rev.push(s.charAt(i));
        }
        while (!rev.isEmpty()) {
            s1 += rev.pop();
        }
        System.out.print(s1);
    }
}
