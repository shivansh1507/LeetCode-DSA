import java.util.*;
import java.util.Scanner;

public class Sortedarray {
    static boolean sort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        System.out.print(sort(arr));

    }
}

// public static void main(String args[]) {
// Scanner sc = new Scanner(System.in);
// int n = sc.nextInt();
// // sc.close();
// int a[] = new int[n];
// for (int i = 0; i < n; i++) {
// a[i] = sc.nextInt();
// }
// for (int k = 0; k < n; k++) {
// for (int j = k + 1; j <= k; j++) {
// if (a[k] < a[j]) {
// System.out.print("Array is Sorted");
// } else {
// System.out.print("Array is not sorted");
// }
// }
// }
// }
