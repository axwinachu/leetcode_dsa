import java.lang.reflect.Array;
import java.util.Arrays;

public class mergeSort {
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] left,int[] right){
        int i=0;
        int j=0;
        int mix=0;
        int[] res=new int[left.length+right.length];
        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                res[mix]=left[i];
                i++;
            }else{
                res[mix]=right[j];
                j++;
            }
            mix++;
        }
        while (i<left.length) {
            res[mix]=left[i];
            i++;
            mix++;
            
        }
        while (j<right.length) {
            res[mix]=right[j];
            j++;
            mix++;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={23,4,4325,34,5,23,2,1,3,234};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
