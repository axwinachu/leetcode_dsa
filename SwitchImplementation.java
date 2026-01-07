public class SwitchImplementation {
    public static void main(String[] args) {
        int day=2;
//        switch(day){
//            case 1,2:
//                System.out.println("day1 or 2");
//                break;
//            case 3:
//                System.out.println("no more comments");
//                break;
//            default:
//                System.out.println("default");
//
//        }
        switch(day){
            case 1-> System.out.println("good morning");
            case 2->System.out.println("good night");
            case 3->System.out.println("go to work");
            default->System.out.println("don't waste time");
        }
    }
}
