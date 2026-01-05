public class CellingOfTheNumber {
    public static void main(String[] args) {
        int[] arr={1,3,4,5,6,6,6,67,67,67,78,90,100};
        int target=15;
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                System.out.println(arr[mid]);
            }else if(arr[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        System.out.println(start);
        System.out.println(end);
    }
}
