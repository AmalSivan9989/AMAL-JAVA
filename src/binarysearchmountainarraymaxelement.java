public class binarysearchmountainarraymaxelement {
    public static void main(String[] args) {
int arr[]={1,2,4,5,6,3,2};
int ans=mountainarray(arr);
        System.out.println(ans);

    }
    /*in mountain array the array increases first then after a point it decreases
    in this we have to find the max num in the array
    so we take two conditions
    1.if arr[mid]>arr[mid+1] in this case then the array will be in decreasing order as the value before it is bigger than the next one
    so in this case we have to see the left side as we understood the elements in right are smaller than mid
    so we have to take end=mid;
    2. if arr[mid]<arr[mid+1] in this case the array will be in ascending order as the value after it is larger than the before
    so in this case we have to see the right side  as we understood that the left side are smaller than the mid
    so we have to take start=mid+1;
    because as mid is lower than mid+1 so we have to take the index from mid+1
    at a pointer the start will be equal to end then indirectly start and end points the maximum value




     */
    static int mountainarray(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //decreasing order
                end=mid;
            }
            else if(arr[mid]<arr[mid+1]){
                //ascending order
                start=mid+1;

            }

        }
        return start;
    }
}
