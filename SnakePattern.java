public class SnakePattern {
    public static void main(String[] args) {
        int n = 5;
        int num=1;

        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=n;j++){
                    System.out.print(num+"\t");
                    num++;
                }
            }else{
                int temp=num+n-1;
                for(int j=1;j<=n;j++){
                    System.out.print(temp--+"\t");
                }
                num=num+n;
            }
            System.out.println();
        }
    }
}
