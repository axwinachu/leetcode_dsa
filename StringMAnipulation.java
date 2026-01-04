import java.util.ArrayList;
import java.util.Scanner;

public class StringMAnipulation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>(10));
        }
        for(int i=0;i<list.size();i++){
            for(int j=0;j<3;j++){
                list.get(i).add(i+j);
            }
        }
        System.out.println(list);
    }
}
