public class Arr {
    //public static void main(String[] args) {
    //properties
    int[]arr;
    int size;
    int n=0,i;

    //methods
        public void displayElements(){
        for(i=0;i<n;i++)
            {
                System.out.println("arr[i]");
            }
        }
        public void insertElement(int element){
            if(n+1 <= size){
                arr[n++]=element;
            }
        }
        public void deleteElement(int element){
        int index=searchElement(element);
            if(index!=-1){
                for(i=index;i<n-1;i++){
                    arr[i]=arr[i+1];
                }
                n--;
            }
        }
        public int searchElement(int element){
            for(i=0;i<n;i++){
                if(arr[i]==element){
                    return i;
                }     
            }return -1;
        }
    //}
}
