public class binarysearchmountainarraysearchaelement {
    public static void main(String[] args) {
        int ans=search();
        System.out.println(ans);
    }
    static int search() {
        int arr[] = {1, 4, 5, 6, 7, 3, 2};
        int target = 3;
        int peak = mountainarray(arr);
        int firstTry = oderagnosticbinarysearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return oderagnosticbinarysearch(arr, target, peak+1, arr.length - 1);
    }

    static int oderagnosticbinarysearch(int arr[],int target,int start,int end){

        boolean isasc;
        if(arr[start]<arr[end]){
            isasc=true;
        }
        else{
            isasc=false;
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }

                if(isasc){
                    if(target<arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }

                }
                else if(!isasc){
                    if(target>arr[mid]){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }

                }

        }
        return -1;

    }
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
