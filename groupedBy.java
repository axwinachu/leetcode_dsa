import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {
    int id;
    String name;
    String dept;
    Student(int id,String name,String dept){
      this.id=id;
      this.name=name;
      this.dept=dept;
    }
    
}
public class groupedBy {
    public static void main(String[] args) {
        List<Student> li=Arrays.asList(new Student(1, "aswin", "cs"),new Student(1, "abi", "cs")
    ,new Student(1, "aswin erw", "cb"));
    Map<Integer,List<Student>> dep=li.stream().collect(Collectors.groupingBy());
    

    }
}
