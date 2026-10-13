import java.util.Scanner;

public class EncodeNumber {
    public String encode(int num) {
        if (num == 0) {
            return "";
        }
        String binary = Integer.toBinaryString(num + 1);
        return binary.substring(1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        EncodeNumber obj = new EncodeNumber();
        String result = obj.encode(num);
        System.out.println("Encoded number: " + result);
        sc.close();
    }
}