public class CheckReverseStr {
    public static void main(String[] args) {
        String str1="ABCD";
        String str2="DCBA";

        if (str1.length()==str2.length() && (str1 + str1).contains(str2))
        {
            System.out.println("");
        }
    }
}
