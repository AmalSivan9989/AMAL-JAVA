public class linearsearch {
    public static void main(String[] args) {
        int arr[]={1,2,35,52,662,66};
        int target =52;
//       int ans= search(arr,target);
//        System.out.println(ans);
        int ans1=linearsearch(arr,target);
        System.out.println(ans1);
    }
    static int search(int nums[],int target){
        if(nums.length==0){
            return -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    static int linearsearch(int nums[],int target){
        if(nums.length==0){
            return -1;
        }
        for (int element:nums){
            if(element==target){
                return element;
            }

        }
        return -1;
    }
}
