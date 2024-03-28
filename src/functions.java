import java.util.Scanner;

public class functions {

    public static void main(String[] args) {
       int result=add2();
        System.out.println(result);
      //  add1();


    }



    static void add1(){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=num1+num2;
        System.out.println("the sum is :"+sum);
    }

    static int add2(){
        Scanner in=new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int sum=num1+num2;
        return sum;
    }

}
