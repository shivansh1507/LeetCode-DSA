import java.util.Scanner;

public class MaxExponents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = MaxExponents(a, b);
        System.out.println(result);
    }

    public static int MaxExponents(int a, int b) {
        int max = -1;

        for (int i = a; i <= b; i++) {
            int exponent = getExponentOf2(i);

            if (exponent > getExponentOf2(max) || (exponent == getExponentOf2(max) && i < max)) {
                max = i;
            }
        }

        return max;
    }

    public static int getExponentOf2(int num) {
        int exponent = 0;

        while (num % 2 == 0) {
            exponent++;
            num /= 2;
        }

        return exponent;
    }
}
