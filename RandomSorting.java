import java.util.Arrays;

public class RandomSorting {
    public static int[] Sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={12,34,53,23,24,45};
       
        System.out.println(Arrays.toString("sorted",Sorting(arr)));
        
    }
}
