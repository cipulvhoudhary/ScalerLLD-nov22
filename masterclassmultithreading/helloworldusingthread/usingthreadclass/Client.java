package masterclassmultithreading.helloworldusingthread.usingthreadclass;

public class Client {

    public static void main(String[] args) {
        System.out.println("Hello world from " +Thread.currentThread().getName());

        // Create an instance of Task(HelloWorldPrinter
        HelloWorldPrinter hw = new HelloWorldPrinter();
        // Create a thread instance and pass obj of task
        Thread t =new Thread(hw);
        // start the Thread
        // start() will automatically invoke run()
        t.start();
    }

}
