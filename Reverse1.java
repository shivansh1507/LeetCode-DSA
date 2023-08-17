import java.util.*;

public class Reverse1 {
    static void Print(int n) {
        if (n == 0)
            return;
        Print(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print(n);
    }

}
