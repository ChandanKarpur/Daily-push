public class ModularInverse {
    public int modInverse(int n,int m){
        for(int i=1;i<m;i++){
            if((n*i)%m==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        ModularInverse mi = new ModularInverse();
        System.out.println(mi.modInverse(10,17));
    }
}
