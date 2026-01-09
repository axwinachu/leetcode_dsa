import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        List<String> li=Arrays.asList("qerw","wref4e","2342437");
       List<String> Result=li.stream().sorted(Comparator.comparingInt(String::length)).toList();
       System.out.println(Result);
    }
}
