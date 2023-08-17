import java.util.Scanner;
import java.util.*;

public class insertpo {
    public static int insert(int arr[], int n, int x, int cap, int pos) {
        if (n == cap)
            return n;
        int idx = pos - 1;
        for (int j = n - 1; j >= idx; j--) {
            a[j + 1] = a[j];
            a[idx] = x;
            return (n + 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
    }
}