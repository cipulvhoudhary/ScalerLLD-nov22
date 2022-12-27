package masterclassmultithreading.numberprinterusingthread.usingRunnable;

// Step 1 : implement / extend Runnable interface / Thread class
public class NumberPrinter implements Runnable{

    // Add a field to store number
    int number;

    // Constructor to get number from Client
    public NumberPrinter(int number) {
        this.number = number;
    }

    // Step 2 :: Override run method
    @Override
    public void run() {
        System.out.println(number + " from " + Thread.currentThread().getName());
    }

}
