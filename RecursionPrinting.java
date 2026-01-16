public class RecursionPrinting {
    static void floyedTriangle(int row){
        helper(row,0);
    }
    static void helper(int row,int col){
       if(row==0){
         return;
       }
       if(col<row){
        helper(row, col+1);
        System.out.print("* ");
         
       }else{
        helper(row-1, 0);
        System.out.println();
       }
    }
    public static void main(String[] args) {
        floyedTriangle(5);
    }
}
