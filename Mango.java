import java.util.Scanner;

public class Mango {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int m = sc.nextInt();
        int rs = sc.nextInt();
        int cp, sp;
        if (a == m) {
            System.out.println(rs);
        }
        if (a > m) {
            cp = a - m;
            rs = rs - cp;
            System.out.println(rs);
        } else if (a < m) {
            sp = m - a;
            rs = sp + rs;
            System.out.println(rs);
        }
    }
}
