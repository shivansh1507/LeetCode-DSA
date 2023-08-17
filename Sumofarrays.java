import java.util.Scanner;

public class Sumofarrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int ar[] = new int[m];
        for (int i = 0; i < arr.length; i++) {
            ar[i] = sc.nextInt();
        }
        int sum[] = new int[n > m ? n : m];
        int c = 0;
        int i = arr.length - 1;
        int j = ar.length - 1;
        int k = sum.length - 1;
        while (k >= 0) {
            int d = c;
            if (i >= 0) {
                d = d + arr[i];
            }
            if (j >= 0) {
                d = d + ar[j];
            }
            c = d / 10;
            d = d % 10;
            sum[k] = d;
            i--;
            j--;
            k--;
        }
        if (c != 0) {
            System.out.print(c);
        }
        for (int val : sum) {
            System.out.print(val);
        }
    }

}
