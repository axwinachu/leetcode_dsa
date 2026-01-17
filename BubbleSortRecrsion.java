import java.util.Arrays;

public class BubbleSortRecrsion {
    static void soting(int[] arr,int iter,int idx){
      if(idx<iter){
        if(arr[idx]>arr[idx+1]){
            int temp=arr[idx];
            arr[idx]=arr[idx+1];
            arr[idx+1]=temp;
            soting(arr, iter, idx+1);
        }else{
         soting(arr, iter, 0);
        }
      }else{
       return;
      }
    }
    public static void main(String[] args) {
        int[] arr={23,34,435,213,13,1,2,12};
        soting(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));
    }
}
