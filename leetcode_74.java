public class leetcode_74 {
    public static void answer(char[] letters,char target){
        int start=0;
        int end=letters.length-1;
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(letters[start]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        System.out.println(letters[end]+""+target+""+letters[start]);
      
    }
    public static void main(String[] args) {
        char[] ch={'c','f','j'};
        answer(ch, 'f');
    }
}
