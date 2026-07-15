package JDBC.code.java;

public class TypeCasting {
    public static void main(String[] args){
        //int a=10;
        //char ch='A';
        //double d=10.25;
        //float f=4.65f;

        //int av=(int)d;
        //System.out.println(av);

        int [] marks={96,65,87,15,67,43};
        System.out.println(marks.length);
        //traditional for loop
        System.out.println("before");
        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        System.out.println("after");
        for (int temp:marks){
            System.out.println(temp+1);
        }

    }
}
