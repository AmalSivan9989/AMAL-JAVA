public class binarysearchflooring {
    public static void main(String[] args) {
        int arr[]={1,4,5,8,9,12,22,45,67,89,123,445};
        int target=44;
        int ans=binarysearchflooring(arr,target);
        System.out.println(ans);
    }
    // in flooring we should take the greatest value in the array that is smaller than the target
    static int binarysearchflooring(int arr[],int target){
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
        return end;
    }
}
