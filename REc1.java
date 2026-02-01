import java.util.ArrayList;

public class REc1 {
    static ArrayList<Integer> getNumbers(int n){
        if(n==0){
            ArrayList<Integer> li=new ArrayList<>();
            return li;
        }
       return getNumbers(n-1);
    }
    public static void main(String[] args) {
        System.out.println(getNumbers(8));
    }
}
