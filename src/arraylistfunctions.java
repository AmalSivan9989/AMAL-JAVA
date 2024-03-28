import java.util.*;
public class arraylistfunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // to add an element
        list.add(24);
        list.add(5);
        list.add(26);
        System.out.println(list);//[24, 5, 26]
        //to remove an element
        list.remove(1);
        System.out.println(list);//[24, 26]
        // to change the value of an element
        list.set(1,29);
        System.out.println(list);//[24, 29]
        //to check whether the element is present or not

        System.out.println(list.contains(5));//false
    }
}
