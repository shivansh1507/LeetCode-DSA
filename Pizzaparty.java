import java.util.*;

public class Pizzaparty {
    public static int maxPizzas(int[] pizzas, int k) {
        int maxPizzas = 0;
        int maxFlavors = k - 1;
        int[] freq = new int[k + 1];
        int distinctFlavors = 0;

        int left = 0;
        int right = 0;

        while (right < pizzas.length) {
            int currentFlavor = pizzas[right];
            if (freq[currentFlavor] == 0) {
                distinctFlavors++;
            }
            freq[currentFlavor]++;
            while (distinctFlavors > maxFlavors) {
                int leftFlavor = pizzas[left];
                freq[leftFlavor]--;
                if (freq[leftFlavor] == 0) {
                    distinctFlavors--;
                }
                left++;
            }
            int currentPizzas = right - left + 1;
            maxPizzas = Math.max(maxPizzas, currentPizzas);

            right++;
        }

        return maxPizzas;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of pizzas: ");
        int n = scanner.nextInt();

        int[] pizzas = new int[n];
        System.out.println("Enter the flavors of the pizzas:");
        for (int i = 0; i < n; i++) {
            pizzas[i] = scanner.nextInt();
        }

        System.out.print("Enter the maximum number of flavors (k): ");
        int k = scanner.nextInt();

        int maxPizzas = maxPizzas(pizzas, k);
        System.out.println("Maximum number of pizzas Bob can eat: " + maxPizzas);
    }
}
