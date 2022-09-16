package Threads;

public class ContadorUtil {
    public static void main(String[] args) {
    Runnable c = new Contador();
    Runnable c2 = new Contador();

    Thread t = new Thread(c);
    Thread t2 = new Thread(c2);

    t.start();
    t2.start();


    }
}
