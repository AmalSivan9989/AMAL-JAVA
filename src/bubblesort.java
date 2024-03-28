import java.util.Arrays;

public class bubblesort {
    public static void main(String[] args) {
int arr[]={3,2,5,4,8,9};
bubblesort(arr);
        System.out.println(Arrays.toString(arr));
    }
    /*
    here we have created a function for bubble sort
    we have initialised a boolean variable swapped
    we took two dimensional arrays i and j
    if the loop i is only executed then the swapped is false
    if loop j also executed then the swapped is true
    suppose if the array is 3 1
    here j-1 is greater than j as j index is 1
    then we should swap both of them
    now keep the j in temp
    assign j-1 value to j
    assign temp to j-1
    consider a as j-1 and b as j
    temp=b
    b=a
    a=temp
    at last in i loop create a conditional loop to check swapped or not

     */
    static void bubblesort(int arr[]){
        boolean swapped;
        for(int i=0;i<arr.length;i++){
            swapped=false;
            for(int j=1;j<arr.length-1;j++){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;

                }
            }
            if (!swapped)
            {
                break;
            }

        }

    }
}
