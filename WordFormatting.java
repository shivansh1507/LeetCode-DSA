import java.util.Scanner;

public class WordFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.split("(?=[A-Z])"); 

        for (int i = 0; i < words.length; i++) {
            if (Character.isUpperCase(words[i].charAt(0))) {
                System.out.print("line " + (i + 1) + " " + words[i].toUpperCase());
            } else {
                System.out.print("line " + (i + 1) + " " + words[i].toLowerCase());
            }
            if (i < words.length - 1) {
                System.out.println();
            }
        }
    }
}
