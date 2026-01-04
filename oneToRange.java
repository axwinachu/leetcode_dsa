public class oneToRange {
    static void count(int num){
        if(num==0){
            return;
        }
        count(num-1);
        System.out.println(num);
    }
    public static void main(String[] args) {
        count(5);
    }
}
