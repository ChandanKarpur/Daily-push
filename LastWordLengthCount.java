import java.util.Scanner;

public class LastWordLengthCount {
    static int findLastWordLength(String str) {
        String[] words = str.trim().split("\\s+");
        return words[words.length - 1].length();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int length = findLastWordLength(str);

        System.out.println("Length of last word: " + length);

        sc.close();
    }
}
