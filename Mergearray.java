import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Mergearray {
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k = m + n;
        int c[] = new int[k];
        System.arraycopy(nums1, 0, c, 0, m);
        System.arraycopy(nums2, 0, c, m, n);
        System.out.print(Arrays.toString(c));
        return 0.0;
    }

    public static void main(String[] args) {    
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int nums1[] = new int[m];
        for (int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        int nums2[] = new int[n];
        for (int j = 0; j < n; j++) {
            nums2[j] = sc.nextInt();
        }
        double useless = findMedianSortedArrays(nums1, nums2);

    }
}