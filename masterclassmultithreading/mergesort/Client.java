package masterclassmultithreading.mergesort;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) {
        List<Integer> values = List.of(10, 9, 8, 7, 1, 2, 3, 4);

        ExecutorService es = Executors.newCachedThreadPool();
        MergeSorter ms = new MergeSorter(values, es);
        Future<List<Integer>> sortedValues = es.submit(ms);

    }

}
