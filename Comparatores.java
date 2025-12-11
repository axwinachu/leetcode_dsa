import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparatores {

        public static void main(String[] args) {
         Comparator com=new Comparator<Integer>() {

        @Override
        public int compare(Integer o1, Integer o2) {
           if(o1%10>o2%10){
            return 1;
           }else{
            return -1;
           }
        }     
    };

        List<Integer> marks=new ArrayList<>();
        marks.add(10);
        marks.add(29);
        marks.add(92);
        marks.add(35);
        marks.add(54);
        Collections.sort(marks,com);
        System.out.println(marks);
        
    }
}
