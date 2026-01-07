import java.sql.SQLOutput;

interface  sample{
    int a=10;
    default void print(){
        System.out.println("printing something");
    }
    static void print2(){
        System.out.println("im the static method");
    }
    public void hello(String name);
}
public class InterfaceImplemetation {

    public static void main(String[] args) {
        System.out.println(sample.a);
        InterfaceImplemetation inter=new InterfaceImplemetation();

        sample.print2();
        sample s =new sample(){
            public void hello(String s1){
                System.out.println(s1);
            }
        };
        sample s2=(String s1)->{
            System.out.println(s1);
        };
       s.print();
       s2.hello("welcome");
    }
}
