public class RemoveString {
    static String removeString(String str,String extract){
        if(str.isEmpty()){
            return str;
        }
        if(str.startsWith(extract)){
            return removeString(str.substring(extract.length()), extract);
        }else{
            return String.valueOf(str.charAt(0))+removeString(str.substring(1), extract);
        }
    }
    public static void main(String[] args) {
        String str="xxxxxxappleaswinyyy";
        String extract="apple";
        System.out.println(removeString(str, extract));
       
    }
}
