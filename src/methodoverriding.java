public class methodoverriding {
    public static void main(String[] args) {
        func(2);
        func(2,4);
        func("amal");
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(int a,int b){
        System.out.println(a);
        System.out.println(b);
    }
    static void func(String a){
        System.out.println(a);
    }

}
