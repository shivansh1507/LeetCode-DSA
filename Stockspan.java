import java.util.Arrays;
import java.util.Stack;

public class Stockspan {
    public static int[] solve(int arr[]) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        span[0] = 1;
        for (int i = 1; i < arr.length; i++) {
            while (st.size() > 0 && arr[i] > arr[st.peek()]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] arr = { 100, 80, 60, 70, 60, 75, 85 };

        int[] span = Stockspan.solve(arr);

        System.out.println("Input array: " + Arrays.toString(arr));
        System.out.println("Span array: " + Arrays.toString(span));
    }
}
