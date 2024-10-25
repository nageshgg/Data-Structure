class D implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
        }
    }}
public class Multithreding {
    public static void main(String[] args) {
        Runnable obj = new D();
        B obj1 = new B();

        Thread t = new Thread(obj);

        t.start();
        obj1.start();
    }

}
