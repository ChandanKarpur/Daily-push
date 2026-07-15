class Display{
    public synchronized void wish(String name){
        for(int i=0;i<5;i++){
            System.out.println("happy diwali");
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(name);
    }
}
class MyRunnable implements Runnable{
    Display d;
    String name;
    MyRunnable(Display d,String name){
        this.d=d;
        this.name=name;
    }
    public void run(){
        d.wish(name);
    }
}
public class SynchronizedDemo {
    public static void main(String[] args) {
        Display obj = new Display();
        Display obj1=new Display();
        MyRunnable t1 = new MyRunnable(obj,"crackers");
        Thread th1 = new Thread(t1);
        MyRunnable t2 = new MyRunnable(obj1,"booms");
        Thread th2 = new Thread(t2);
        th1.start();
        th2.start();
    }
}
