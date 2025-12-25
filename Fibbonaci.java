public class Fibbonaci {
    static void fib(int range,int start,int end){
        if(range-2==0){
            return;
        }
        System.out.println(start+end);
        fib(range-1, end, start+end);
    }
    public static void main(String[] args) {
        System.out.println(0);
        System.out.println(1);
        fib(5,0,1);
    }
}
