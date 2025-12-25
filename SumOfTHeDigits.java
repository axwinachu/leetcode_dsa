public class SumOfTHeDigits {
    static int sumOfDig(int num){
      if(num%10==num){
        return num;        
      }
      return (num%10)+sumOfDig(num/10);
    }
    public static void main(String[] args) {
        int num=46;
        System.out.println(sumOfDig(num));
    }
}
