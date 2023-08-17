import java.util.Scanner;

public class Sumofprevious {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 1;
        int q = 2;
        System.out.print(p + " ");
        System.out.println(q + " ");
        for (int i = 0; i < n; i++) {
            int sum = p + q;
            p = q;
            q = sum;
            System.out.print(sum + " ");
        }
    }
}
