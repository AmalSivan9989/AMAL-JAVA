public class linearsearchmaxwealth {
    public static void main(String[] args) {
int arr[][]={
        {1,2,3},
        {8,8,33},
        {3,53,3}
};
int ans=linearsearch(arr);
        System.out.println(ans);
    }
    // here we need to find the highest sum of every row in the two dimensional matrix
    static int linearsearch(int arr[][]){
        int rowsum=0;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                rowsum=rowsum+arr[row][col];
            }
            int min=Integer.MIN_VALUE;
            if(rowsum>min){
                min=rowsum;

            }
        }
        return rowsum;

    }
}
