package Threads;

public class Contador implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Contagem com a Thread " + Thread.currentThread().getName() + ": " + i );
        }   
    }  
}
