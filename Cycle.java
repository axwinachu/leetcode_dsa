import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int[] arr={3,4,2,5,1};
        int i=0;
        while(i<arr.length){
            int correctIdx=arr[i]-1;
            if(arr[i]!=arr[correctIdx]){
                int temp=arr[i];
                arr[i]=arr[correctIdx];
                arr[correctIdx]=temp;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
