import java.util.Scanner;

public class lcmoftwonumbers {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
       int n1=in.nextInt();
       int n2=in.nextInt();
       int lcm;
       // here we have taken two numbers
        // if n1 is largest then assign lcm as n1
        // if n2 is largest then assign lcm as n2
        //the while loop checks until both n1 and n2 is divisible by lcm
        //if not then the lcm increments until a part when lcm is divisible by both n1 and n2

           if (n1 > n2) {
               lcm = n1;
           } else {
               lcm = n2;
           }
           while(true){
               if(lcm%n1==0&&lcm%n2==0) {
                   System.out.println(lcm);
                   break;
               }
               lcm++;

    }
}}
