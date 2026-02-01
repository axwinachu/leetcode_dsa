public class SumOfTheArrayUsingREcursion {
    static int sumOfArray(int[] arr){
        return helper(arr,0);
    }
    static int helper(int[] arr,int idx){
        if(idx==arr.length){
            return 0;
        }
        return arr[idx]+ helper(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println(sumOfArray(arr));
    }
}
