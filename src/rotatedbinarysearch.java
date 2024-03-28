public class rotatedbinarysearch {
    public static void main(String[] args) {
int arr[]={4,5,6,7,0,1,2};
int target=6;
int ans=ans(arr,target);
        System.out.println(ans);
    }


    /*
      by the findpivot function we found the pivot element
      now we have to call the binarysearch function and also we should initialize its  start and end
      there are some cases to do this
      1.if start element is less than target
        then return binarysearch(arr,target,start=0,end=pivot-1)
      2. if start element is greater than target
        then return binarysearch(arr,target,start=pivot+1,end=arr.length-1)
    */
    static int ans(int arr[],int target){
        int pivot=findpivot(arr);
        if(arr[0]<target){
            return binarsearch(arr,target,0,pivot-1);
        }
        else{
            return binarsearch(arr,target,pivot+1,arr.length-1);
        }
    }
    /*
    after we initialize  findpivot function we have to initialize binarysearch function but in this we give start and end as arguments
    we write a normal binary search code

   */
    static int binarsearch(int arr[],int target,int start,int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }
            if(target<arr[mid]){
                end=mid-1;
            }
            if(target>arr[mid]){
                start=mid+1;
            }
        }
        return -1;

    }/*
     here we have a rotated sorted array that means upto a point it will be in ascending order then again it starts
     from a new ascending order array
     here to search for a particular target we have first find the pivot element(max element)
     in order to find the pivot we declare a findpivot function
     in this function
     1.we take the start=0 and end=arr.length-1;
     2.then we find mid index in while loop
     3.to find the pivot index we have four case
       case-1:
       we have to check whether the element in mid is less than mid+1
       then we return mid+1
       case-2:
       we have to check whether the mid element is larger than mid-1
       then we have to return mid-1
       case-3:
       we have to check the mid element with the start element
       if the mid element is greater than start element
       then start=mid+1
       case-3:
       if the mid element is smaller than the start element
       then end=mid-1;

    this function returns the pivot element

     */
    static int findpivot(int arr[]){
        int start=0;

        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
        //case-1
        if (mid<end && arr[mid]<arr[mid+1]){
            return mid+1;
        }
        if(mid<end && arr[mid]>arr[mid-1]){
            return mid;
        }
        if(arr[mid]<=start){
            end=mid-1;
        }
        else if(arr[mid]>=start){
            start=mid+1;
        }
    }
        return -1;
    }
}
