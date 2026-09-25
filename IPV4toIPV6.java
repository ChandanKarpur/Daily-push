import java.util.Scanner;

public class IPV4toIPV6 {
    static String convert(String ip) {
        String[] p = ip.split("\\.");
        int a = Integer.parseInt(p[0]);
        int b = Integer.parseInt(p[1]);
        int c = Integer.parseInt(p[2]);
        int d = Integer.parseInt(p[3]);
        String h1 = String.format("%02x", a);
        String h2 = String.format("%02x", b);
        String h3 = String.format("%02x", c);
        String h4 = String.format("%02x", d);

        return "::ffff:" + h1 + h2 + ":" + h3 + h4;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter IPv4 address: ");
        String ip = sc.nextLine();
        String result = convert(ip);
        System.out.println("IPv6 Address: " + result);
        sc.close();
    }
}
