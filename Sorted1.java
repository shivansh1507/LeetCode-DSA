import java.util.Scanner;
import java.util.*;

public class Sorted1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 1; j < a.length; j++) {
            if (a[j] < a[j - 1]) {
                System.out.print("Array is sorted");
            } else {
                System.out.print("Array is not sorted");
            }
        }
    }
}