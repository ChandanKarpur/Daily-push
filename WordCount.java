import java.util.Scanner;

public class WordCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of words = 0");
        } else {
            int count = 1;
            for (int i = 0; i < sentence.length(); i++) {
                if (sentence.charAt(i) == ' ' &&
                    sentence.charAt(i - 1) != ' ') {
                    count++;
                }
            }
            System.out.println("Number of words = " + count);
        }
        sc.close();
    }
}