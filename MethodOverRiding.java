import java.math.MathContext;

class Test{
    void print(){
        System.out.println("im the parent method");
    }
}
public class MethodOverRiding extends Test{
    void sample(){
        System.out.println("im the sample");
    }
    MethodOverRiding(){

    }
    MethodOverRiding(String name){
        System.out.println(name);
    }
    @Override
    void print() {
        new MethodOverRiding("aswin");
        this.sample();
        System.out.println("im the child print");
        super.print();
    }

    public static void main(String[] args) {
        MethodOverRiding mo=new MethodOverRiding();
        mo.print();
    }
}
