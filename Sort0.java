
import java.util.Arrays;

import java.util.Scanner;

public class Sort0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] == 0) {
            arr[1] = arr[0];
            arr[0] = arr[1];
        }
                    System.out.println(arr);
    }
}
