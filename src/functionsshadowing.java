public class functionsshadowing {
    static int x=10;
    public static void main(String[] args) {
        System.out.println(x);
        int x=20;//the value of x is shadowed
        System.out.println(x);
        func(x);
        func();


    }
    static void func(int x){
        System.out.println(x);
    }
    static void func(){
        System.out.println(x);
    }
}
