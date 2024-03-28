import java.util.*;

public class multidimensionalarrays {
    public static void main(String[] args) {
        int arr[][]=new int [3][3];
        func(arr);
    }
    static void func(int nums[][]){
        Scanner in=new Scanner(System.in);
        for (int row = 0; row <nums.length ; row++) {
            for (int col = 0; col < nums[row].length; col++) {
                nums[row][col]=in.nextInt();
                System.out.print(nums[row][col]);
                /*
can also output array as
for(int[][] nums:num){
System.out.println(num);
}
or
System.out.println(Array.toString(nums);


*/
            }


            System.out.println("");

        }

    }
}
