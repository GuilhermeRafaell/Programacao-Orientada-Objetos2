import java.lang.Thread;
import java.lang.Runnable;

class RunnableDemo implements Runnable {
    private Thread t;
    private String threadName;

    RunnableDemo(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    public void run() {
        System.out.println("Running " + threadName);
        try {
            for (int i = 0; i < 100; i++) {
                System.out.println("Thread: " + threadName + ", " + i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + threadName + " interrupted.");
        }
        System.out.println("Thread " + threadName + " exiting.");
    }

    public void start() {
        System.out.println("Starting " + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}

public class thread {

    // Implementando um programa que imprima os números primos existentes entre 0 e
    // 9999 e calcula o tempo de execução.
    // Para cada faixa de 100 números, cria uma thread e dispara o processo para
    // cada uma delas.
    // Ao final, imprime o tempo total de execução.

    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 0) {
                RunnableDemo R1 = new RunnableDemo("Thread-" + i);
                R1.start();
            }
        }
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Tempo de execução: " + (tempoFinal - tempoInicial) + " ms");
        /*
         * RunnableDemo R1 = new RunnableDemo("Thread-1");
         * R1.start();
         * 
         * RunnableDemo R2 = new RunnableDemo("Thread-2");
         * R2.start();
         */
    }
}