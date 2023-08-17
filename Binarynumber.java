import java.util.Scanner;

public class Binarynumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s == null) {
            System.out.print("-1");
            return; // Exit the program if input is null
        }

        int result = operationsBinaryString(s);
        System.out.println("Evaluated Result: " + result);
    }

    public static int operationsBinaryString(String str) {
        if (str == null)
            return -1;

        int res = str.charAt(0) - '0';
        for (int i = 1; i < str.length();) {
            char prev = str.charAt(i);
            i++;
            if (prev == 'A')
                res = res & (str.charAt(i) - '0');
            else if (prev == 'B')
                res = res | (str.charAt(i) - '0');
            else
                res = res ^ (str.charAt(i) - '0');
            i++;
        }
        return res;
    }
}
