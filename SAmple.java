public class SAmple {
    static void print(int num){
      if(num<=0){
        return;
      }
      System.out.println(num);
      print(num-1);
      System.out.println(num);
    }
    public static void main(String[] args) {
        print(5);
    }
}
