import java.util.Scanner;

public class hcfoftwonumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        // we initialize two numbers n1 and n2
        //if one of the no is 0 then the other number will be the hcf
        // if n1>n2 then we have to subtract n2 from n1
        // else if n1<n2 them we have to subtract n1 from n2
        // the subtraction goes on at a point the both n1 and n2 will be equal
        //on that point the loop breaks
        // then if the n1 and n2 are same we print any one of them
        if(n1==0){
            System.out.println("gcd:"+n2);
        }
        if(n2==0){
            System.out.println("gcd:"+n1);
        }
        while(n1!=n2){
            if(n1>n2){
                n1=n1-n2;
            }
            if(n1<n2){
                n2=n2-n1;
            }
            if(n1==n2){
                System.out.println("gcd:"+n1);
            }
        }
    }
}
