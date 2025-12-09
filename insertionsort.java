import java.util.Arrays;

public class insertionsort {
    int[] insertion_sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){ 
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={1,3,4,5,67,8,6,6};
        insertionsort sort=new insertionsort();
        sort.insertion_sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
