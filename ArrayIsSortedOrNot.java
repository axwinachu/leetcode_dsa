public class ArrayIsSortedOrNot {
    static boolean isSortedOrNot(int[] arr,int idx){
        if(idx==arr.length-1){
            return true;
        }
        return arr[idx]<=arr[idx+1]&&isSortedOrNot(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,8};
        System.out.println(isSortedOrNot(arr,0));
    }
}
