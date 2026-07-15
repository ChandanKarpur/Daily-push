class ElementNotFoundException extends Exception{
    int [] elements;

    public ElementNotFoundException(int[] elements){
        this.elements=elements;
    }

    public ElementNotFoundException(String message){
        super(message);
    }

    public int binarySearch(int start,int end,int element)throws ElementNotFoundException{
        if(start>end)
            throw new ElementNotFoundException("element is not found in the list");
        int mid=(start+end)/2;
        if(elements[mid]==element)
            return mid;
        else if(elements[mid]<element)
            return binarySearch(mid+1, end, element);
        else
            return binarySearch(start, mid-1, element);
    }

    public int searchElement(int element)throws ElementNotFoundException{
        int i=-1;
        try {
            i= binarySearch(0, elements.length-1, element);
        } catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return i;
    }
    
    public class SearchFromArray {
        public static void main(String[] args) {
        int[] elements={1,2,3,4,5,6,7,8,9};
        int findValue=4;
        ElementNotFoundException obj = new ElementNotFoundException(elements);
        try {
            System.out.println("Element "+findValue+" is found at index : "+obj.searchElement(findValue));
        } 
        catch (ElementNotFoundException e) {
            System.out.println(e.getMessage());
        }
        }
    }
}        
    
    

