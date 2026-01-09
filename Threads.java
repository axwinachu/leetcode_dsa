import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threads {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("from thread 1->"+i);
                }
            }
        };
        Runnable r2=new Runnable() {
            public void run(){
                for(int i=0;i<10;i++){
                    System.out.println("from thread 2->"+i);
                }
            }
        };
        Runnable r3=new Runnable() {
            public void run(){
               for(int i=0;i<10;i++){
                System.out.println("from thread 3->"+i);
               }
            }
        };
        ExecutorService executorService=Executors.newFixedThreadPool(2);
        executorService.submit(r1);
        executorService.submit(r2);
        executorService.submit(r3);
        executorService.shutdown();
    }
}
