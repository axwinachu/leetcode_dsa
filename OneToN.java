import java.sql.SQLOutput;
import java.util.ArrayList;

public class OneToN {
    static ArrayList<Integer> getArrayList(int num){
        if(num==0){
            ArrayList<Integer> li=new ArrayList<>();
            li.add(0);
            return li;
        }
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(num);
        getArrayList(num-1);

    }
    public static void main(String[] args) {
        System.out.println(getArrayList(5));
    }
}
