public class CheckTheArrayIsSotedORNot {
    static boolean isSorted(int[] arr){
        return helper(arr,0);
    }
    static boolean helper(int[] arr,int idx){
       if(arr.length-1==idx){
        return true;
       }
       return arr[idx]<arr[idx+1] && helper(arr, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,8};
        System.out.println(isSorted(arr));
    }
    
}
