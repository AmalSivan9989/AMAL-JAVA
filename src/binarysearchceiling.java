public class binarysearchceiling {
    public static void main(String[] args) {
int arr[]={1,4,5,8,9,12,22,45,67,89,123,445};
int target=44;
int ans=binarysearchceiling(arr,target);
        System.out.println(ans);
    }
    // as here the target is not present in the given array
    //ceiling stands for the smallest value in array if that is grater than target
    // it happens when it denies the condition of the loop
    //then the end pointer will be first after then the start pointer will come
    //now according to the ceiling if the last array is 14,16 and the target value is 15
    //then if the end and mid  pointer is 14 and the start pointer is 16
    //then the smallest number that is greater than the target will be the start
    static int binarysearchceiling(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while (start <= end) {
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }

        }
        return start;
    }
}
