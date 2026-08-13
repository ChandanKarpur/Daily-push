import java.util.Scanner;

public class Pyramid {
    public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int n=sc.nextInt();
		int i,j,k;
		for(i=1;i<=n;i++){
			for(j=i;j<n;j++){
				System.out.print(" ");
			}
			for(k=1;k<=(2*i-1);k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
