public class StringCal {
    public static void main(String[] args) {
        String str="7A8B18C001D33E";
        String num="";
        int sum=0;
        for (int i=0;i<str.length();i++) {
            char ch=str.charAt(i);
            if(Character.isDigit(ch)){
                num=num+ch;
            }else{
                if(!num.isEmpty()){
                    sum=sum+Integer.parseInt(num);
                    num = "";
                }
            }
        }
        if (!num.isEmpty()) {
            sum = sum+Integer.parseInt(num);
        }
        System.out.println("Sum of numbers in the string: " + sum);
    }
}