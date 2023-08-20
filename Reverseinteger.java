import java.util.Scanner;

public class Reverseinteger {
    public int reverse(int x) {
        int reversed = 0; 
        while (x != 0) {
            int lastDigit = x % 10;
            
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) {
                return 0; 
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) {
                return 0; 
            }
            reversed = reversed * 10 + lastDigit; 
            x /= 10; 
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Reverseinteger ob1 = new Reverseinteger();
        int reversed = ob1.reverse(n);
        System.out.print(reversed);   
    }
}
