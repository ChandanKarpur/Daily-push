public class Segregate0sAnd1s {
    static void segregate0sAnd1s(int[] arr) {
        int left=0,right=arr.length-1;
        while(left<right) {
            while(arr[left]==0 && left<right) {
                left++;
            }
            while(arr[right]==1 && left<right) {
                right--;
            }
            if(left<right) {
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,1,0,1,1,0,0,1};
        segregate0sAnd1s(arr);
        System.out.println("Array after segregation: ");
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
