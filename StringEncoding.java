public class StringEncoding {
    public static void main(String[] args) {
        String str = "abcd";
        int n=2;
        char alpha[]="abcdefghijklmnopqrstuvwxyz".toCharArray();
        char arr[]=str.toCharArray();

        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            int index=ch-97;
            index=(index+n)%alpha.length;
            arr[i]=alpha[index];
        }
        System.out.println(new String(arr));
    }
}
