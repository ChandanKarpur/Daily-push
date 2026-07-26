class InterThread2 extends Thread{
    int total=0;
    public void run(){
        synchronized(this){
            System.out.println("child thread start calculation");
            for(int i=0;i<=100;i++){
                total=total+i;
                try {
                Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            System.out.println("child thread giving notification call");
            this.notify();
        }
    }    
}    
public class InterThread {
    public static void main(String[] args) throws InterruptedException{
        InterThread2 it = new InterThread2();
        it.start();
        synchronized(it){
            System.out.println("main thread calling wait() method");
            it.wait();
            System.out.println("main thread got notification call");
            System.out.println(it.total);
        } 
    }
}
  