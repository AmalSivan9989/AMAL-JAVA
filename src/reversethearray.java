import java.util.Arrays;

public class reversethearray {
    public static void main(String[] args) {
        int arr[]={1,4,3,2,5};
        reverse(arr);

    }
    /*
    here we are declaring a reverse function it should take the start and end indices and should swap method
    so the start should be incremented
    and end should be decremented

    */
    static void reverse(int arr[]){
        int start=0;
        int end=arr.length-1;
        swap(arr,start,end);
        start++;
        end--;

    }
// here in this method we give the arguments as array and also the start and end indices
    // accordingly using a temp variable we will swap and print the array
    static void swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
