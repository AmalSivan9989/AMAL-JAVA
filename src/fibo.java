import java.util.Scanner;
public class fibo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int temp=0;
        int i=2;
        while(i<=n){
            temp=b;
            b=a+b;
            a=temp;
            i++;
            System.out.println(b);
        }
        System.out.println("the value is"+b);
    }
}
