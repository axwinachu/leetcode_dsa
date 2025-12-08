import java.util.Arrays;

public class SelectionSort {
    int[] selection_sort(int[] arr){
        for(int i=0;i<arr.length;i++){
           int maxIndex=i;
           int lastIndex=arr.length-i-1;
            for(int j=0;j<arr.length-1-i;j++){
               if(arr[j]<arr[maxIndex]){
                maxIndex=j;
               }
            }
            int temp=arr[maxIndex];
            arr[maxIndex]=arr[lastIndex];
            arr[lastIndex]=temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={2,43,4,56,56,7,68,78,43};
        SelectionSort sort=new SelectionSort();
        sort.selection_sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
