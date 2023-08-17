import java.util.Scanner;

public class Swapthecharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        System.out.print("Enter the third string: ");
        String str3 = sc.nextLine();
        String modifiedStr1 = swapVowels(str1);
        String modifiedStr2 = swapConsonants(str2);
        String modifiedStr3 = str3.toUpperCase();
        String result = modifiedStr1 + modifiedStr2 + modifiedStr3;
        System.out.println("Output: " + result);
    }

    private static String swapVowels(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (isVowel(c)) {
                result.append('$');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    private static String swapConsonants(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (!isVowel(c)) {
                result.append('#');
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
