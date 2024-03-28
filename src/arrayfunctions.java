import java.util.*;

public class arrayfunctions {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int arr []=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        //for void function
        func1(arr);
        System.out.println(Arrays.toString(arr));

// for int funnction
        int res[]=func(arr);
        System.out.println(res);

    }
    // here we are returning a integer array so we have to give the datatype of the function as integer array i.e int[]
    static int[] func(int nums[]){
        nums[0]=99;
        return nums;

    }
    static void func1(int nums[]){
        nums[0]=98;
    }
}
