class ArrayRotating {
    int arr[]={1,2,3,4,5};

    ArrayRotating(){
        for (int i : arr) {
            System.out.println(i);
        }
        System.out.println();
    }

    public void LeftShift(int start){
        for (int i=0;i<arr.length-1;i++){
            System.out.println(arr[(i+start)%arr.length]+" ");
        }
        System.out.println();
    }

    public void RotateCount(int num){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[(i+num)%arr.length]+" ");
        }
        System.out.println("Array after "+num+" rotations :");
    }
}
public class ArrayShifting {
    public static void main(String[] args) {
        ArrayRotating obj = new ArrayRotating();
        obj.LeftShift(2);
        obj.RotateCount(2);
    }
}
