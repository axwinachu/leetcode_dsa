import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListFrequency {
    public static void main(String[] args) {
        String str="q213214e2q3re";
        List<String> li=Arrays.stream(str.split("")).toList();
        System.out.println(Collections.frequency(li, "q"));
    }
}
