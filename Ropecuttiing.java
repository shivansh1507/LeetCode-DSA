import java.util.Scanner;

public class Ropecuttiing {
    public static int Maxp(int n, int a, int b, int c) {
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;
        int res = Math.max(Maxp((n - a), a, b, c)), Maxp((n - b), a, b, c), Maxp((n - c), a, b, c);
        if (res == -1);
        return -1;
        return res + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
    }
}
