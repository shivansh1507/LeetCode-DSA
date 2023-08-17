import java.util.Scanner;

public class Singledigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int r;
        if (n == 0 || n <= 9) {
            System.out.print(n);
        } else {
            while (n > 9) {
                r = n / 10;
                n = n % 10;
                sum = n + r;
                n = sum;
            }
            System.out.print(sum);
        }
    }
}