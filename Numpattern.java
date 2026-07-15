import java.util.Scanner;
public class Numpattern{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		sc.close();
		System.out.print("enter a number");
		int n=sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++)
			{
			for(j=1;j<=i;j++)
				{
				System.out.print(" "+k);
				k++;
				}
			System.out.print("\n");
			}
		}
	
}
			