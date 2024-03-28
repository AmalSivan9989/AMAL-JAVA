public class linearsearchformaxvalue {
    public static void main(String[] args) {
        int arr[]={345,24,255,2222,555,32};
        int ans=min(arr);
        System.out.println(ans);
    }
    static int min(int arr[]){
        if(arr.length==0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            int min=arr[0];
            if(arr[i]>min){
                min=arr[i];
                return arr[i];


            }
        }
        return -1;
    }

}
