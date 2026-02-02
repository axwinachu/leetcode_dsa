import java.util.ArrayList;

public class findTheInedxFrom {
    static ArrayList<Integer> findAllIndex(int[] arr,int target,int idx){
        ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length){
            return list;
        }
       
        list.addAll(findAllIndex(arr, target, idx+1));
         if(arr[idx]==target){
            list.add(idx);
        }
        return list;
       }
    public static void main(String[] args) {
        int[] arr={2,3,2,3,4,2,4,2};
        System.out.println(findAllIndex(arr, 2, 0));
    }
}
