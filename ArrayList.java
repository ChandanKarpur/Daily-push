public class ArrayList {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList<String>();
            list.add("Chandan");
            list.add("Behera");
            list.add("10");

            String s1=(String)list.get(0);
            String s2=(String)list.get(1);
            String s3=(String)list.get(2);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
    }
}
