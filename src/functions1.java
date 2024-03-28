import java.util.Arrays;

public class functions1 {
    public static void main(String[] args) {
        int arr []={1,34,76,5};
        fun(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void fun(int name[]){
        name[0]=99;
    }
}
