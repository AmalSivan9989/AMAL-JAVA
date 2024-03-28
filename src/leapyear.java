public class leapyear {
    public static void main(String[] args) {
        leapyear(2024);
    }
    static void leapyear(int year){
        if(year%400==0){
            System.out.println("its a leap year");

        }
        else if(year%100==0){
            System.out.println("its not a leap year");
        }
        else if(year%4==0){
            System.out.println("its a leap year");
        }
        else {
            System.out.println("its not a leap year");
        }
    }
}
