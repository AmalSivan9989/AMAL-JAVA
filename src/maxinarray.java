import java.util.*;
public class maxinarray {

    public static void main(String[] args) {
        int arr[]={183,464,27,283,77};
        max(arr);
        maxRange(arr,1,4);


    }
    static void max(int arr[]){
        int  max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
    static void maxRange(int arr[],int start,int end){
        int  max=arr[0];
        for (int i = start; i < end; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
