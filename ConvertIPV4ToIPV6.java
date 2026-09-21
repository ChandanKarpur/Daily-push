import java.util.Scanner;

public class ConvertIPV4ToIPV6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter IPv4 address: ");
        String ip = sc.nextLine();

        // Split IPv4 using dot
        String[] p = ip.split("\\.");

        int a = Integer.parseInt(p[0]);
        int b = Integer.parseInt(p[1]);
        int c = Integer.parseInt(p[2]);
        int d = Integer.parseInt(p[3]);

        // Convert each part to hexadecimal
        String h1 = Integer.toHexString(a);
        String h2 = Integer.toHexString(b);
        String h3 = Integer.toHexString(c);
        String h4 = Integer.toHexString(d);

        String ipv6 = "::ffff:" + h1 + h2 + ":" + h3 + h4;

        System.out.println("IPv6 Address: " + ipv6);
        sc.close();
    }
}
