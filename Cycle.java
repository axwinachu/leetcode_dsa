import java.util.Arrays;

public class Cycle {
    public static void main(String[] args) {
        int[] arr={3,3,3,3,3};
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
        for(int j=0;j<arr.length;j++){
            if(j+1!=arr[j]){
               if (arr[j]==arr[arr[j]-1]) {
                System.out.println(arr[j]);
               }
            }
        }
        
    }
}
