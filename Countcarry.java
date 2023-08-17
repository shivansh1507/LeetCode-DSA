import java.util.Scanner;

public class Countcarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int carries = 0;
        int carry = 0;

        while (num1 > 0 || num2 > 0) {
            int digit1 = num1 % 10;
            int digit2 = num2 % 10;

            int sum = digit1 + digit2 + carry;
            if (sum >= 10) {
                carries++;
                carry = 1;
            } else {
                carry = 0;
            }

            num1 /= 10;
            num2 /= 10;
        }
        System.out.print(carries);
    }
}
