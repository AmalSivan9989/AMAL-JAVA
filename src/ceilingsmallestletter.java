public class ceilingsmallestletter {
    public static void main(String[] args) {
char arr[]={'c','f','j'};
char target='l';
char ans=binarysearchceiling(arr,target);
        System.out.println(ans);
    }
    // here the problem is on ceiling
    //and also ceiling means the smallest value present in the array that is greater than the target
    //if there is no letter bigger than the array than we should give the index o as output
    //this is called as wrapping
    //for getting the index value as 0 we do start%arr.length
    // as we know that at a point start crosses the end and becomes end+1 when the loop brakes
    //then if the start reaches last then the start and length of array will be same the modulus of them will be 0
    //this happens when the target letter is larger than the values in the array

    static char binarysearchceiling(char arr[],char target){
    int start=0;
    int end=arr.length-1;
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target<arr[mid]){
            end=mid-1;
        }
        else{
            start=mid+1;
        }
    }

    return arr[start%arr.length];
    }
}
