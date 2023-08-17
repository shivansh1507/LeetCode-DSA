import java.util.Scanner;

public class CountRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n > m) {
            System.out.println(-1);
            return;
        }

        int count = 0;
        for (int i = n; i <= m; i++) {
            if (containsOnly149(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    public static boolean containsOnly149(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit != 1 && digit != 4 && digit != 9) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
