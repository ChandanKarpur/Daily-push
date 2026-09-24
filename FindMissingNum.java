
public class FindMissingNum {
   public static int findMissingNumber(int arr[], int n) {
      for(int i=1;i<=n;i++) {
         boolean found = false;
         for(int j=0;j<arr.length;j++) {
            if(arr[j] == i) {
               found = true;
               break;
            }
         }
         if(!found) {
            return i;
         }
      }
      return -1;
   }
   public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5, 6};
        int n = 6;
        int missingNumber = findMissingNumber(arr, n);
        if(missingNumber != -1) {
             System.out.println("The missing number is: " + missingNumber);
        } else {
             System.out.println("No missing number found.");
        }
   }
}
