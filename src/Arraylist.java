import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        ArrayList <Integer> list =new ArrayList<>(10);
        //adding elements using add method
        list.add(64);
        System.out.println(list);

        ArrayList <Integer> list1 =new ArrayList<>(10);
        // adding elements by input(for loop)
        //for array list we dont need for loop to  print we can print directly using the name of the list
        for (int i = 0;i<5; i++) {
            int res=in.nextInt();
            list1.add(res);
        }
        System.out.println(list1);


    }
}
