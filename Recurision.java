public class Recurision {
    static int Sum(int range,int ans){
       
        if(range==0){
            return ans;
        }
        ans+=range;
        return Sum(range-1,ans);

    }
    public static void main(String[] args) {
        System.out.println(Sum(5,0)); 
    }
}
