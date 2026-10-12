import java.util.Arrays;
import java.util.Scanner;

public class ConstructRectangle {

    public int[] constructRectangle(int area) {

        int w = (int) Math.sqrt(area);

        while (area % w != 0) {
            w--;
        }

        int l = area / w;

        return new int[]{l, w};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the area: ");
        int area = sc.nextInt();

        ConstructRectangle obj = new ConstructRectangle();

        int[] result = obj.constructRectangle(area);

        System.out.println("Length and Width: " + Arrays.toString(result));

        sc.close();
    }
}