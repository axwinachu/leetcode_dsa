import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelProcessing {
    String getFirstName() throws InterruptedException{
        Thread.sleep(2000);
        return "shiyas";
    }
    static String getSecondtName() throws InterruptedException{
        Thread.sleep(2000);
        return "shiyas";
    }
 public static void main(String[] args) {
    ParallelProcessing pp=new ParallelProcessing();
    try{
        Callable<String> fname=new Callable<String>() {
            @Override
            public String call() throws Exception {
                return pp.getFirstName();
            
        }
    };
        Callable<String> lname=new Callable<String>() {
            @Override
            public String call() throws Exception {
                return pp.getSecondtName();
            
        }
    };
    ExecutorService ex=Executors.newFixedThreadPool(2);
    Long time=System.currentTimeMillis();
    Future<String> fnamString=ex.submit(fname);
    Future<String> laString=ex.submit(lname);
    System.out.println(fnamString.get()+""+laString.get());
    Long exit=System.currentTimeMillis();

    System.out.println(exit-time);
    }
    catch(Exception ex){
        System.out.println(ex.getMessage());
    }


 }
}
