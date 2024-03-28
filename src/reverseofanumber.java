import java.util.Scanner;

public class reverseofanumber {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
int ans=0;
     while(n>0){
         int rem=n%10;
         n=n/10;
         /*  if n=239 first ans=0
            then we get remainder as 9
             then the n value will become 23
             ans=0*10+9
             then the value of n will be 23
             the remainder will be 3
             the value of n will be 2
             ans=9*10+3=93
             then the remainder will be 2
             n value will be 0
             ans=93*10+2=932

          */
         ans=ans*10+rem;
     }
        System.out.println(ans);

    }
}
