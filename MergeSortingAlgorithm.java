import java.util.Arrays;

public class MergeSortingAlgorithm {
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] first=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] second=mergeSort(Arrays.copyOfRange(arr,mid, arr.length));
        return merge(first,second);
    }
    private static int[] merge(int[] first, int[] second) {
        int[] mix=new int[first.length+second.length];
        int i=0;
        int j=0;
        int k=0;
       while (i<first.length && j<second.length) {
        if(first[i]<second[j]){
            mix[k]=first[i];
            i++;
            k++;
        }else{
            mix[k]=second[j];
            j++;
            k++;
        }
       }
       while (i<first.length) {
        mix[k]=first[i];
        k++;
        i++;
       }
       while (j<second.length) {
        mix[k]=second[j];
        k++;
        j++;
       }
       return mix;
    }
    public static void main(String[] args) {
        int[] arr={34,2,3,45,32,425,435,36,67,21};
        System.out.println(Arrays.toString( mergeSort(arr)));
    }
}
