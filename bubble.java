import java.util.Arrays;

public class bubble {
    static void bubbleSort(int[] arr){
        helper(arr,arr.length-1,0);
    }
    static void helper(int[] arr,int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            if(arr[c]>arr[c+1]){
              int temp=arr[c];
              arr[c]=arr[c+1];
              arr[c+1]=temp;
            }
            helper(arr, r, c+1);
        }else{
            helper(arr, r-1, 0);
        }
    }
    public static void main(String[] args) {
        int[] arr={5,4,5,5,6,7,6,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
