import java.util.Arrays;

public class SelectRecursion {
    static void select(int[] arr){
        helper(arr,arr.length-1,0,0);
    }
    static void helper(int[] arr,int r,int c,int max){
        if(r==0){
            return;
        }
        if(c<=r){
            if(arr[c]>arr[max]){
                helper(arr, r, c+1, c);
            }else{
                helper(arr, r, c+1, max);
                System.out.println();
            }
        }else{
            int temp=arr[max];
            arr[max]=arr[r];
            arr[r]=temp;
            helper(arr, r-1, 0, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr={243,4,43,34,645,6,45,567,7};
        select(arr);
        System.out.println(Arrays.toString(arr));
    }
}
