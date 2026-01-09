
import java.util.HashSet;
import java.util.Set;

class Student{
    int id=0;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return this.id+"-->"+this.name;
    }
    public boolean equals(Object o){
      Student s=(Student) o;
      return this.id==s.id;
    }
    public int hashCode(){
        return id;
    }
}

public class overRideHash {
    static int findTotal(Set<Student> student){
        Integer sum=student.stream().map(d->d.id).reduce(0,(acc, data) ->acc+data );
        return sum;
    }
    public static void main(String[] args) {
        Set<Student> set=new HashSet<>();
        set.add(new Student(1, "aswin"));
        set.add(new Student(1, "aswin"));
        System.out.println(set);
        System.out.println(findTotal(set));

    }
}