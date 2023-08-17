import java.util.Scanner;

public class Individualaddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int odd = 0;
        int even = 0;
        for (int i = 1; i < n; i++) {
            if (i % 2 != 0) {
                odd = odd + i;
            } else {
                even = even + i;
            }
        }
        System.out.print(odd + " ");
        System.out.print(even + " ");
    }
}
