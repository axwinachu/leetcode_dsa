import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class twoDToOndD {
    public static void main(String[] args) {
        int[] arr={23,34,54,6,567};
        Arrays.stream(arr).map(d->d*2).forEach(System.out::println);
        String str="aaab";
        Long res=Arrays.stream(str.split("")).distinct().count();
        System.out.println(res);
        List<Integer> li=Arrays.asList(1,2,345,65767);
        List li2=new ArrayList<>(Arrays.asList(12,3,445,56,"arfdwe",7667));
        Iterator it=li2.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
