public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 84;
        int c = 0;

        while (b > 0) {
            b = b / 2;
            a = a + 6;
            c = a + b;

            while (c > 40) {
                if (c % 2 == 0) {
                    System.out.println(a);
                } else {
                    System.out.println(b);
                }
                c = c / 10;
            }
        }

        System.out.println(c);
    }
}
