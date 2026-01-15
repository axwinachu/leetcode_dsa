public class Reverse {
    static int reverseDigit(int num,int rev){
        if(num<=0){
            return rev;
        }
        int rem=num%10;
        rev=(rev*10)+rem;
        return reverseDigit(num/10, rev);

    }
    public static void main(String[] args) {
        System.out.println(reverseDigit(205,0));
    }
}
