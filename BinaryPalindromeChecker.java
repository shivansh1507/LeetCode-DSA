import java.util.Scanner;

public class BinaryPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binaryNumber = sc.nextLine();

        if (isBinaryPalindrome(binaryNumber)) {
            System.out.println("The number is a binary palindrome.");
        } else {
            System.out.println("The number is not a binary palindrome.");
        }

        sc.close();
    }

    public static boolean isBinaryPalindrome(String binaryNumber) {
        int length = binaryNumber.length();
        for (int i = 0; i < length / 2; i++) {
            if (binaryNumber.charAt(i) != binaryNumber.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
