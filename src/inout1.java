

import java.util.Scanner;

public class inout1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int total=num1+num2;
        System.out.println(total);
        // celsius to temperature
        System.out.println("enter the celsius:");
        float celsius=sc.nextFloat();
        float farenheit=(celsius* 9/5)+32;
        System.out.println(farenheit);


    }
}
