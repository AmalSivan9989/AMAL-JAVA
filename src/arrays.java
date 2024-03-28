import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //array of primitives
        //array decleration
        int arr []=new int[5];

        //array input
        for (int i = 0; i < arr.length; i++) {
            arr[i]=in.nextInt();
        }
        //array output
        //1st method
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");

        }
        //2nd method
        for(int num:arr){
            System.out.print(num+" ");
        }
        //3rd method
        System.out.println(Arrays.toString(arr));

    }
}
