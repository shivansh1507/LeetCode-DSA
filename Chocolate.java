import java.util.Scanner;

public class Chocolate {

    public static int results(int n, int k) {
        return (int) Math.round(Math.pow(n,
                (1.0 / Math.pow(2.0, k))));
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();

        System.out.print(results(n, k));
    }
}