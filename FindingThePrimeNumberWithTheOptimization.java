public class FindingThePrimeNumberWithTheOptimization {
    static boolean findIsPrimeOrNot(int num){
        boolean ans=true;
        for(int i=2;i<=Math.sqrt(num);i++){
           if(num%i==0){
            return false;
           }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(findIsPrimeOrNot(6));
    }
}
