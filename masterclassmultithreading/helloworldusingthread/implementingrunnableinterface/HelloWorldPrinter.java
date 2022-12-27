package masterclassmultithreading.helloworldusingthread.implementingrunnableinterface;

public class HelloWorldPrinter implements Runnable{

    @Override
    public void run() {
        for(int i=0; i<100; i++) {
            System.out.println("Hello world from " + Thread.currentThread().getName());
        }
    }

}
