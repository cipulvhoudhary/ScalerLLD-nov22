package masterclassmultithreading.helloworldusingthread.implementingrunnableinterface;

public class Client {

    public static void main(String[] args) {

        HelloWorldPrinter hw = new HelloWorldPrinter();
        Thread t = new Thread(hw);
        t.start();

        for(int i=0; i<100; i++) {
            System.out.println("Hello world from " +Thread.currentThread().getName());
        }

    }
}
