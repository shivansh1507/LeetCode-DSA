import java.util.Scanner;

public class Amountoffood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int unit = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int food = r * unit;
        if (arr == null) {
            System.out.print("-1");
        }
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total = total + arr[i];
            count = count + 1;
            if (total >= food) {
                System.out.print(count);
                break;
            }
        }
        if (total < food) {
            System.out.print("0");
        }
    }
}
