import java.util.Arrays;

public class leetcode278 {
    public static void main(String[] args) {
        int[] arr={1,3,4,2,2};
        int i=0;
        while (i<arr.length) {
            int correctIdx=arr[i]-1;
            if(arr[i]!=i+1){
               if(arr[i]!=arr[correctIdx]){
                int temp=arr[i];
                arr[i]=arr[correctIdx];
                arr[correctIdx]=temp;
               }else{
                System.out.println(arr[i]);
                break;
               }
             
            }else{

                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
