public class primenumber {
    public static void main(String[] args) {
        primenumber(2);
    }
    static void primenumber(int n){
        if(n==1){
            System.out.println("it is not a prime number");
        }
        if(n==2){
            System.out.println("it is a prime number");
        }
        else if(n%2==0){
            System.out.println("it is not  a prime number");
        }
    }
}
