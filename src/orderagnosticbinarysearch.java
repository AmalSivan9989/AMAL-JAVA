public class orderagnosticbinarysearch {
    public static void main(String[] args) {
int arr[]={1,2,45,67,88,333,556,754};
//int arr[]={789,566,333,223,112,88,78,55,32,2};
        int target=88;
        int ans=binarysearch(arr,target);
        System.out.println(ans);
    }
// in ordergnostic binary search we dont know whether the array is ascending order or descending order
    //so we have to first find whether the given array is in ascending order or descending order
    //finding whether a array is ascending or descending oder is by comparing the first and last elements in the array
    //if arr[start]<arr[end] then the array is in ascending order or it will be in descending order
    //we have to check the array is in ascending or descending order then we have to compare the arr[mid] with the target value


    static int binarysearch(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isasc;
        if (arr[start] < arr[end]) {
            isasc = true;
        }
        else{
            isasc = false;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
             if(target==arr[mid]) {
                return mid;
            }
            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else if (!isasc) {

                if (target > arr[mid]){
                        end = mid - 1;
                    }
                else{
                        start = mid + 1;
                    }
                }


        }
return -1;
    }}

