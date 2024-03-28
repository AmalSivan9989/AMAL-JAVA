public class linearsearchusingstring {
    public static void main(String[] args) {
        String str="amalsivan";
        char ch='v';
int ans=linearsearch(str,ch);
        System.out.println(ans);
    }
    static int linearsearch(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==target){
                return i;
            }

        }
        return -1;
    }
}
