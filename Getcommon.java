import java.util.HashMap;
import java.util.Scanner;

public class Getcommon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a1[] = new int[n];
        int a2[] = new int[m];
        for (int i = 0; i < n; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a2[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> fmap = new HashMap<>();
        for (int val : a1) {
            if (fmap.containsKey(val)) {
                int of = fmap.get(val);
                int nf = of + 1;
                fmap.put(val, nf);
            } else {
                fmap.put(val, 1);
            }
        }
        for (int val : a2) {
            if (fmap.containsKey(val))
                System.out.print(val);
            fmap.remove(val);
        }
    }
}
