import java.util.ArrayList;

public class Arraylistnto1 {
    static ArrayList geArrayList(int num){
        if(num==0){
            return new ArrayList<>();
        }
        ArrayList<Integer> li=new ArrayList<>();
        li.addAll(geArrayList(num-1));
        return li;
    }
    public static void main(String[] args) {
        System.out.println(geArrayList(5));
    }
}
