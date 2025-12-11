import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Even {
    public final int age;
   Even(int age){
    this.age=age;
   }
    public static void main(String[] args) {
       String str="esrrfthhuiklpp";
       
       List<Character> ch=new ArrayList<>();
       for(int i=0;i<str.length();i++){
        ch.add(str.charAt(i));
       }
       for(int i=0;i<ch.size();i++){
        int count=0;
        for(int j=i;j<ch.size();j++){
           if(ch.get(i)==ch.get(j)){
            count++;
           }
        }
        if(count>1){
           System.out.println(ch.get(i));
        }
       }
    }
}
