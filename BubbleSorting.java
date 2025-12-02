import java.util.Arrays;

public class BubbleSorting {
    public static int[] sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean toggled=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    toggled=true;
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            if(toggled==false){
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr={10,34,5436,78,9,856,3254};
        System.out.println(Arrays.toString(sorting(arr)));
        
    }
    
}
