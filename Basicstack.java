import java.util.Stack;

public class Basicstack {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(10);
        System.out.println(st);
        st.push(20);
        System.out.println(st);
        st.push(30);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.print(st);
    }
}
