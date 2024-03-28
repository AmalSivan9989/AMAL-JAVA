import java.util.*;
public class linearsearchtwoDsearch {
    public static void main(String[] args) {
        int arr[][]={

                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int target=7;
        // also while calling the function it should be stored in an int array
        //for one dimensional array need only int return value
        //but for two dimensional array need int array as a return value

      int[] ans= linearsearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    //here we have taken an int array datatype function to get the return value as array
    static int[] linearsearch(int[][] arr, int target){
// when comes to two dimensional array if we need to return the index for searching an element
        // then we have initialize a int array object
        // if we want to return -1 then it should be return as return new int[]{-1,-1};
        // if we want to return any index value then we have to return as return new int[]{i,j};
if(arr.length==0){
    return new int[]{-1,-1};
}
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }

            }


        }
        return new int[]{-1,-1};
    }
}
