public class FindingThePrimeNumberWithTheOptimization {
    static boolean findIsPrimeOrNot(int num){
        boolean ans=true;
        if(num<=1){
            return false;
        }
        for(int i=2;i*i<=num;i++){
           if(num%i==0){
            return false;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.println(i+"-"+findIsPrimeOrNot(i));
        }
    }
}
