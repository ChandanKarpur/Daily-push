class Car {
    void start(){
        System.out.println("car is start.");
    }
    
}
class Play extends Car{
    void playmusic(){
        System.out.println("car is play music.");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Play p=new Play();
        p.start();
        p.playmusic();
    } 
}
