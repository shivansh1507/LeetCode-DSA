import java.util.Scanner;

public class MakeaPalindrome {
    public static boolean isPalindrome(char[] str) {
        int len = str.length;
        if (len == 1)
            return true;
        int ptr1 = 0;
        int ptr2 = len - 1;

        while (ptr2 >= ptr1) {
            if (str[ptr1] != str[ptr2])
                return false;
            ptr1++;
            ptr2--;
        }

        return true;
    }

    public static int noOfAppends(String s) {
        if (isPalindrome(s.toCharArray()))
            return 0;
        s = s.substring(1);

        return 1 + noOfAppends(s);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.printf("%d\n", noOfAppends(s));
    }
}
