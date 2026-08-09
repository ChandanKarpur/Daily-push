import java.util.Scanner;
public class InsertString{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        int pos;

        System.out.print("enter the string:");
        str=sc.nextLine();
        System.out.print("enter the position:");
        pos=sc.nextInt();
        System.out.print("enter the another string:");
        String newStr=sc.next();

        str=str.substring(0,pos-1)+newStr+str.substring(pos-1);
        System.out.println("after insertion:"+str);
        sc.close();
    }
}