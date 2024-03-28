import java.util.Arrays;

public class binarysearchtwodimension {
    public static void main(String[] args) {
        int arr[][]={{10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
                              };
        int target=37;
        int [] ans=binarysearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    // this is for when the row and columns are in a sorted manner
    //note: the whole matrix is not sorted continuously

    /*
    here in this function
    if the arr[row][column]==target then it returns the index
    if the arr[row][column]< target then
    if in the first row all the elements are less than target so we have to move to the next row so row++
    if the arr[row][column]> target then
    if in the first row the last column value is greater than target then the whole column will be greater than target
    because the array is in sorted order
    so in order to skip that column move to the previous column that means column--
    if target is not present in the array then return -1,-1
     */
    static int[] binarysearch(int arr[][],int target){
        int row=0;
        int column=arr.length;
        for ( row = 0; row < arr.length; row++) {
            for ( column = 0; column < arr[row].length; column++) {
                if(arr[row][column]==target){
                    return new int[]{row,column};
                }
                if(arr[row][column]<target){
                    row++;

                }
                else if(arr[row][column]>target){
                    column--;
                }
            }
        }
        return new int[]{-1,-1};

    }
}
