import java.util.Scanner;
public class checkupperornot {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char a=in.next().trim().charAt(0);
        //char should be denoted with-''
        if ( a>='a' &&  a<='z'){
            System.out.println("lowercase");
        }
        else{
            System.out.println("uppercase");
        }
    }
}
