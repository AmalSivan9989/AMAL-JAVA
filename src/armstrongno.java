import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int  n=in.nextInt();

        for(int i=100;i<=1000;i++){
            func(i);
            System.out.println();
        }
    }
    static void func(int n){
        int original=n;
        int i=0;
        int sum=0;
        while(n!=0){
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
        System.out.println(sum);
        if (sum==original){
            System.out.println("it is an armstrong no");
        }
        else{
            System.out.println("not an armstrong number");
        }

// can also use boolean return type for function then the output of if loop should be return either true or false
    }
}
