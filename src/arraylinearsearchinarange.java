public class arraylinearsearchinarange {
    public static void main(String[] args) {
     int arr[]={1,3,3,42,64,73,7,4,74,435,43};
     int target=73;
     int start =3;
     int end=8;
     int ans=linearsearch(arr,target,start,end);
        System.out.println(ans);
    }
    static int linearsearch(int arr[],int target,int start,int end){
        if(arr.length==0){
        return -1;
        }
        for ( start = 0; start < end; start++) {
            if(arr[start]==target){
                return start;
            }

        }
        return -1;
    }
}
