import java.util.Scanner;

public class pattern {
    // public void patterns(String txt, String pat) {
    // int pos = txt.indexOf(pat);
    // while (pos >= 0) {
    // System.out.print(pos + " ");
    // pos = txt.indexOf(pat, pos + 1);
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String txt = sc.nextLine();
        String pat = sc.nextLine();
        int pos = txt.indexOf(pat);
        while (pos >= 0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
    }
}
