import java.util.ArrayList;

public class Divisiors {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> a= new ArrayList<>();
        ArrayList<Integer> b= new ArrayList<>();
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                a.add(i);
                if(i!=n/i){
                    b.add(n/i);
                }
            }
        }
        java.util.Collections.reverse(b);
        a.addAll(b);
        return a;
    }
    public static void main(String[] args) {
        Divisiors divisors = new Divisiors();
        int number = 36; 
        ArrayList<Integer> result = divisors.getDivisors(number);
        System.out.println("The divisors of " + number + " are: " + result);
    }
}
