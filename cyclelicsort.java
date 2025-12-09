import java.util.Arrays;

public class cyclelicsort {
    int[] cyclic_sort(int[] arr,int start,int end){
        int i=0;
       while(i<arr.length){
        int correctIdx=arr[i]-start;
        if(arr[i]!=arr[correctIdx]){
          int temp=arr[i];
          arr[i]=arr[correctIdx];
          arr[correctIdx]=temp;
        }else{
          i++;
        }
       }
       return arr;
        
    }

    public static void main(String[] args) {
        int start=2;
        int end=5;
        int[] arr={3,2,5,4};
        cyclelicsort sort=new cyclelicsort();
        sort.cyclic_sort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }

}
