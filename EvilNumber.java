import java.util.Scanner;
public class EvilNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp=number;
        int count=0;
        while(temp>0){
            if(temp%2==1){
                count++;
            }
            temp/=2;
        }
        if(count%2==0){
            System.out.println(number + " is an evil number.");
        }else{
            System.out.println(number + " is not an evil number.");
        }

    } 
}