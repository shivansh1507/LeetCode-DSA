public class Basics {
    public static void fun1() {
        System.out.println("fun1");
    }

    public static void fun2() {
        System.out.println("fun2");
        fun1();
    }

    public static void main(String args[]) {
        System.out.println("Before fun 2");
        fun2();
        System.out.println("After fun 1");
    }

}
