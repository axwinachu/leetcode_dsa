import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class freequency {
    public static void main(String[] args) {
       String str="sarwevwter";
       Map<String,Integer> map=new HashMap<>();
       Arrays.stream(str.split("")).forEach(d->{
        if(map.containsKey(d)){
            int prevValue=map.get(d);
            map.put(d,prevValue+1);
        }else{
            map.put(d, 1);
        }
       });
       for(Map.Entry<String,Integer> data:map.entrySet()){
        if(data.getValue()>1){
            System.out.println(data.getKey());
        }
       }
    }
    
}
