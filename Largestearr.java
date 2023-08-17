import java.util.Scanner;
import java.util.*;

public class Largestearr {
    static int getLarge(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag == true)
                return i;
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int k = 0; k < n; k++) {
            arr[k] = sc.nextInt();
        }
        System.out.print(getLarge(arr));
    }
}
