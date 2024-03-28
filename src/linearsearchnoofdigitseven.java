public class linearsearchnoofdigitseven {
    public static void main(String[] args) {
int arr[]={1,2,454,33,5555,11,44};
int ans=findnumber(arr);
        System.out.println(ans);
    }
    // Step-1 initialize a whole function which counts and inside it check whether the output of even function is even or not
    //step-2 initialize an even function and first we need to count the digits so in even functions we check whether the digits are even or not
    // step-3 we initialize a digits function which counts the no of digits
    //find
    // number function called even ,even function called digits
    static int findnumber(int arr[]){
        int count=0;
        for (int num:arr) {
        if(even(num)){
            count++;
        }
        }
        return count;
    }

  static boolean even(int n) {
        int noofdigits=digits(n);
  if(noofdigits%2==0){
      return true;
  }
  return false;
    }
    static int digits(int n){
        if(n<0){
            n=n*-1;
        }
        if (n == 0) {
            return 1;
        }
        int count=0;
        while(n>0){
        count++;
        n=n/10;
        }
        return count;
    }
}
