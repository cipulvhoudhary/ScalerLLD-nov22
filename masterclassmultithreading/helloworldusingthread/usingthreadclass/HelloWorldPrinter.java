package masterclassmultithreading.helloworldusingthread.usingthreadclass;

// step 1 :: Extend Thread class
public class HelloWorldPrinter extends Thread {

    // Step 2 :: implement run()
    @Override
    public void run() {
        System.out.println("Hello world from " +Thread.currentThread().getName());
    }
}
