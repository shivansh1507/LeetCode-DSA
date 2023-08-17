import java.util.Scanner;

public class Givenrange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int g = sc.nextInt();
        int num;
        for (int i = n; i <= g; i++) {
            num = i;
            int r = i % 10;
            int q = i / 10;
            if (r != q) {
                System.out.print(" " + num);
            }
        }
    }
}