import java.util.HashSet;
import java.util.Scanner;

public class Dupicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        boolean flag = false;
        HashSet<Integer> s = new HashSet<>();
        for (int i : a) {
            if (s.contains(i)) {
                flag = true;
            } else {
                s.add(i);
            }
        }
        System.out.println(flag);
    }
}
