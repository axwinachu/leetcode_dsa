import java.util.Arrays;

public class plaindromUsingStram {
    public static void main(String[] args) {
        String str="abc";
        String result=Arrays.stream(str.split("")).reduce("",(a,b)->{
            System.out.println(b+""+a);
            return b+a;
        });
        System.out.println(result);
    }
    
}
