package masterclassmultithreading.numberprinterusingthread.usingexecutors;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Client {

    public static void main(String[] args) {

        Executor executor1 = Executors.newFixedThreadPool(10);
        Executor executor2 = Executors.newCachedThreadPool();
        Executor executor3 = Executors.newSingleThreadExecutor();


        for(int i=0; i<=100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            executor1.execute(np);
        }

        for(int i=0; i<=100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            executor2.execute(np);
        }

        for(int i=0; i<=100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            executor3.execute(np);
        }

    }

}
