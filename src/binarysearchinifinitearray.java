public class binarysearchinifinitearray {
    public static void main(String[] args) {
int arr[]={2,3,5,5,7,8,9,10,34,55,567,778};
int target=10;
int ans=ans(arr,target);
        System.out.println(ans);
    }
    //here in this function actually we dont know the start and end indexes
    //to find them we take start as 0,and end as 1
    //as we move the start and end in the form of chunks
    //o we first initialize start as start=0
    //we initialize end as end=1;
    //then we take a temporary storage for start and intialize it as end+1
    //because the new chunk start should not match with the old end
    //so we take the value of temp as end+1
    //now to calculate end
    //here start=0 and end=1
    //we take start+(end-(start-1))*2;
    //then end=0+(1-(0-1))*2
    //then new end=4
    //as end-(start-1) gives us the array in which the target element is located
    //now we got the new start as end+1
    // we add it with the the array that contains the target and also we should multiply it with 2
    //by this the chunks of array will move according to the multiple of 2
    //now give this start and end to the binary search function and call ans function in the main function
    static int ans(int arr[],int target){
int start=0;
int end=1;
        int temp=0;

while(target>arr[end]){
    temp=end+1;
    end=start+(end-(start-1))*2;
    start=temp;

}
return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
