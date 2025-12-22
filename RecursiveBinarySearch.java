public class RecursiveBinarySearch {
    static int Search(int[] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]<target){
                Search(arr,target,start=mid+1,end=arr.length);
            }else{
                return Search(arr,target,start,end=mid-1);
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,4,78,89};
        int target=4;
        System.out.println(Search(arr,target,0,arr.length-1));
    }
}
