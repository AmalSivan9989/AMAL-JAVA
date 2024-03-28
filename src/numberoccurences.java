import java.util.Scanner;
public class numberoccurences {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

       int count=0;
       while(n>0){
           int remainder=n%10;
           if(remainder==5){
               count++;
           }
           n=n/10;

       }
        System.out.println(count);

    }
}
