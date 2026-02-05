import java.util.Collections;
import java.util.PriorityQueue;

public class PriceBalancer {
    
    public static int minOperations(int[] prices, int k, int d){
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
     
        for(int p : prices){
            minHeap.add(p);
            maxHeap.add(p);
        }

        int operations = 0;

        while (true) {
            int min = minHeap.peek();
            int max =maxHeap.peek();

            if(max - min < d) break;

            minHeap.poll();
            maxHeap.poll();

            int diff = max - min;

            // best p we can transfer
            int p = Math.min(k, diff/2);

            // update values
            min += p;
            max -= p;

            minHeap.add(min);
            maxHeap.add(max);

            operations++;

        }
        return operations;
    }

    //Driver code
    public static void main(String[] args) {
        int[] prices = {1,10,15};
        int k = 3;
        int d = 4;

        System.out.println(minOperations(prices, k, d));
    }
}
