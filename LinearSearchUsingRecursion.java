public class LinearSearchUsingRecursion {
     static int linearSearch(int[] arr,int target,int idx){
        if(idx==arr.length){
            return -1;
        }
        return arr[idx]==target?idx: linearSearch(arr,target,idx+1);
    }
    public static void main(String[] args) {
       int[] arr={1,23,2,345,3,354,6,457};
       int target=45;
       System.out.println(linearSearch(arr,target,0));
    }
}
