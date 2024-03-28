import java.util.Arrays;

public class variableargumentsfunctions {
    public static void main(String[] args) {
      func(24, "amnfbn","hgdgghdh","vevhedh");
    }
    static void func(int s,String ...f){
        System.out.println(Arrays.toString(f));
        System.out.println(s);
    }
}
