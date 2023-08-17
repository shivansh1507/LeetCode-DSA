import java.util.Scanner;
import java.util.*;

public class Maximumoccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (hm.containsKey(ch)) {
                int of = hm.get(ch);
                int nf = of + 1;
                hm.put(ch, nf);
            } else {
                hm.put(ch, 1);
            }
        }
        char mfc = s.charAt(0);
        for (Character key : hm.keySet()) {
            if (hm.get(key) >= hm.get(mfc)) {
                mfc = key;
            }
        }
        System.out.println(mfc);
    }
}
