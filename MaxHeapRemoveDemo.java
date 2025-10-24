import java.util.*;

public class MaxHeapRemoveDemo {
    public static void main(String[] args) {
        // Create a Max Heap using reverse order comparator
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        // Example input
        int[] arr = {50, 30, 40, 10, 60, 20};

        // Add elements to max heap
        for (int num : arr) {
            maxHeap.add(num);
        }

        System.out.println("Initial Max Heap: " + maxHeap);

        // Remove a specific element (not necessarily the root)
        boolean removed = maxHeap.remove(40); // O(n)
        System.out.println("Removed element 40: " + removed);
        System.out.println("Heap after removing 40: " + maxHeap);

        // Remove (poll) the maximum element (root)
        int max = maxHeap.poll(); // O(log n)
        System.out.println("Removed top element (max): " + max);
        System.out.println("Heap after poll: " + maxHeap);

        // Peek the current maximum
        System.out.println("Current top element (peek): " + maxHeap.peek());

        // Remove all elements one by one
        System.out.print("Removing all elements in descending order: ");
        while (!maxHeap.isEmpty()) {
            System.out.print(maxHeap.poll() + " ");
        }
    }
}
