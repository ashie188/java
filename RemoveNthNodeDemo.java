import java.util.*;

public class RemoveNthNodeDemo {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    // Your removeNthFromEnd logic (unchanged)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null) return null;

        int length = 0;
        ListNode curr = head;

        // Calculate total length
        while (curr != null) {
            curr = curr.next;
            length++;
        }

        // If we need to remove the head node
        if (length == n) {
            curr = head.next;
            head.next = null;
            return curr;
        }

        ListNode prev = head;
        curr = head;

        // Move to the (length-n)th node
        for (int i = 0; i < length - n; i++) {
            if (curr != head) {
                prev = prev.next;
            }
            curr = curr.next;
        }

        // Delete the node
        prev.next = curr.next;
        return head;
    }

    // Utility: build linked list from array
    public static ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Utility: print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // MAIN FUNCTION
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sample Input:
        // 5  (size of list)
        // 1 2 3 4 5
        // 2  (n)
        
        System.out.print("Enter size of linked list: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter values:");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();

        System.out.print("Enter n (remove nth from end): ");
        int n = sc.nextInt();

        RemoveNthNodeDemo obj = new RemoveNthNodeDemo();
        ListNode head = buildList(arr);

        System.out.println("\nOriginal List:");
        printList(head);

        head = obj.removeNthFromEnd(head, n);

        System.out.println("After Removing " + n + "th from end:");
        printList(head);
    }
}
