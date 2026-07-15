public class StringSumInt {
    public static void main(String[] args) {
        String str = "7A8B18C001D33E";
        int i = 0;
        int sum=0;

        while(i<str.length()) {
            char ch = str.charAt(i);
            int num=0;
            while (ch>='0' && ch<= '9') {
                num = num * 10 + (ch - '0');
                if(i+1<str.length()) {
                    i++;
                    ch = str.charAt(i);
                } else {
                    break;
                } 
            }
            sum=sum+num;
        }
        System.out.println("Sum of numbers in the string: " + sum);
    }
}
