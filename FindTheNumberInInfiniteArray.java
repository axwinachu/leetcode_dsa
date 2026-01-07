public class FindTheNumberInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,12,34,38,39,40,42,45,49,50};
        int start=0;
        int end=1;
        int target=49;
        while(arr[end]<target){
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
            System.out.println(start+"--"+end);
        }
        System.out.println(start);
        System.out.println(end);
    }
}
