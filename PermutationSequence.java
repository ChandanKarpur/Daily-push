import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;

public class PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * i;
        }
        k = k - 1;
        String result = "";
        for (int i = n; i >= 1; i--) {
            int index = k / fact;
            result = result + numbers.get(index);
            numbers.remove(index);
            k = k % fact;
            if (i > 1) {
                fact = fact / (i - 1);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number between 1 to 5:");
        int n=sc.nextInt();
        System.out.println("Enter the value of k :");
        int k=sc.nextInt();
        PermutationSequence ps=new PermutationSequence();
        String result = ps.getPermutation(n, k);
        System.out.println("the sequence umber is :"+ result);
        sc.close();
    }
}
