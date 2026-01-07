public class ThreadChecking extends  Thread {
    volatile boolean status=true;
    void stratTask() throws InterruptedException {
        System.out.println("task started");
        Thread.sleep(10);
        System.out.println("ended");
    }
    public static void main(String[] args) {
        ThreadChecking th=new ThreadChecking();
        Thread t1=new Thread(()-> {
            try {
                th.stratTask();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        th.status=false;
    }
}
