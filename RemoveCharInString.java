public class RemoveCharInString {
    static String removeChar(String str,char ch){
        if(str.isEmpty()){
            return str;
        }
        if(str.charAt(0)==ch){
            return removeChar(str.substring(1), ch);
        }else{
            return str.substring(0,1)+removeChar(str.substring(1),ch);
        }

    }
    public static void main(String[] args) {
        String str="saerqwaedaa";
        char ch='a';
        System.out.println(removeChar(str,ch));
    }
}
