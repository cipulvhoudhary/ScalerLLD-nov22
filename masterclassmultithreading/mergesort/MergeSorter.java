package masterclassmultithreading.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/**
 * Executor do not accept callables. Therefore we are using ExecutorService
 */

// Step 1 : implement Runnable interface
public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> list = new ArrayList<>();
    private ExecutorService executorService;

    public MergeSorter(List<Integer> list, ExecutorService executorService) {
        this.list = list;
        this.executorService = executorService;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        //perfor task
        return null;
    }
}
