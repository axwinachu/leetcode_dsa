import java.util.ArrayList;

public class lastToEd {
   static ArrayList<Integer> findIdx(int[] nums,int idx,ArrayList<Integer> list){
    if(idx==nums.length){
        return list;
    }

    findIdx(nums, idx+1, list);
    if(nums[idx]==34){
        list.add(idx);
    }
    return list;       

   }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] arr={34,54,645,643,563,34,54,34,345,56};
       System.out.println(findIdx(arr,0,list));
    }
}
