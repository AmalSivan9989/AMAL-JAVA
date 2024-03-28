public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,4,5,8,9,12,22,45,67,89,123,445};
        int target=123;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
    //here we have initialized a function
    //in that we have taken start and end indexes
    //then we have taken the mid index
    //we have compared the mid index element in array with target
    // if target value is greater than the mid index element
    // then the start changes to start=mid+1 i.e the value lies between mid+1 and end
    // if target value is lesser than the mid index value
    // then the end changes to end=mid-1 i.e the value lies between start and mid-1
    //according to this the array is divided and again checked the division of array goes on untill mid index will be the target
    static int binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
