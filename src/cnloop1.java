import java.util.Scanner;
public class cnloop1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
//        if(a>b){
//            System.out.println(a+" is the largest");
//        }
//        else if(b>c){
//            System.out.println(b+"  is the largest");
//        }
//        else if(c>a){
//            System.out.println(c+"  is the largest");
//        }


        int max=Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
