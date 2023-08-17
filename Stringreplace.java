import java.util.Scanner;

public class Stringreplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        if (s.equals(" ")) {
            System.out.print("null");
        } else if (a == b) {
            System.out.print(s);
        } else {
            StringBuilder modified = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == a) {
                    modified.append(b);
                } else if (s.charAt(i) == b) {
                    modified.append(a);
                } else {
                    modified.append(s.charAt(i));
                }
            }
            System.out.print(modified.toString());
        }
    }
}
