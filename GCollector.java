enum Status{
    ACTIVE,
    INACTIVE
        }
public class GCollector {



    public static void main(String[] args) {
        Status staus=Status.ACTIVE;
        switch (staus){
            case ACTIVE -> System.out.println("im active");
            case INACTIVE -> System.out.println("im in active");
            default -> System.out.println("status not found");
        }
    }

}
