public class FactDigit {
    static int sumOfDigits(int num){
       if(num<10){
        return num;
       }
       return num%10+sumOfDigits(num/10);
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(26));
    }
}
