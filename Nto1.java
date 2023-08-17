import java.util.*;

public class Nto1 {
    static void Print(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        Print(n - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // int n = 5;
        Print(n);
    }
}