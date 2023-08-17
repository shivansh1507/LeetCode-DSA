import java.util.*;

public class RemoveDuplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int temp[] = new int[n];
        int res = 1;
        temp[0] = arr[0];
        for (int j = 1; j < n; j++) {
            if (temp[res - 1] != arr[j]) {
                temp[res] = arr[j];
                res++;
            }
        }
        for (int j = 0; j < res; j++) {
            arr[j] = temp[j];
            System.out.print(temp[j] + " ");
        }
        System.out.println("\n Elements in array after removal of duplicates are " + res);
    }
}