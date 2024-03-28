public class swap {
    public static void main(String[] args) {
swap(123,145);
    }
    static void swap(int a,int b){
        int temp=0;

            temp=b;
            b=a;
            a=temp;

            System.out.println(a+" "+b);
        }
    }

