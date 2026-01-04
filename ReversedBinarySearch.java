public class ReversedBinarySearch {
    public static void main(String[] args) {
        int[] arr={89,56,34,23,12,1};
        int start=0;
        int end=arr.length-1;
        int target =23;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            }else if(arr[mid]<target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
    }
}
