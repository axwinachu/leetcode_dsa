public class matrix {
    static void matrix(int n){
        helper(n,0);
    }
    static void helper(int n,int c){
        if(n==0){
            System.out.print("("+n+","+c+")");
            return;
        }
        if(c<=n){
            System.out.print("("+n+","+c+")");
            helper(n, c+1);
        }else{
            System.out.println("out");
            helper(n-1, 0);
        }
    }
    public static void main(String[] args) {
        matrix(5);
    }
}
