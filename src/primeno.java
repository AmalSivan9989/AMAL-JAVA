import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        primeno(n);
    }
    static void primeno(int n){
        if( n==1){
            System.out.println("is not prime");
        }
       if( n==2){
           System.out.println("is prime");
       }
       else{
           for(int i=2;i<=n;i++){
               if(n%2==0){
                   System.out.println("is not prime");
                   break;
               }
               else{
                   System.out.println("is prime");
               }

           }
       }

    }
}
