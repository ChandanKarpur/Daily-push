class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
public class MyThread {
    public static void main(String[] args) {
        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("main thread");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
