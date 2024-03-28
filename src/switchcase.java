import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String fruit=in.nextLine();
        switch (fruit) {
            case "mango" -> System.out.println("king of fruits");
            case "apple" -> System.out.println("it is a healthy fruit");
            case "grapes" -> System.out.println("it is a small fruit");
            default -> System.out.println("enter a valid fruit");
        }
    }
}
