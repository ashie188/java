public class PartitionList86 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null) return head;

        ListNode curr = head;
        ListNode prev = null;
        ListNode greaternode = null;
        ListNode previousgreater = null;

        // find first node >= x
        while (curr != null) {
            if (curr.val >= x) {
                greaternode = curr;
                previousgreater = prev;
                break;
            }
            prev = curr;
            curr = curr.next;
        }

        // no >= x found
        if (greaternode == null) return head;

        curr = greaternode.next;
        prev = greaternode;

        while (curr != null) {
            if (curr.val < x) {
                // detach curr
                prev.next = curr.next;

                // insert before greaternode
                if (previousgreater != null) {
                    previousgreater.next = curr;
                } else {
                    head = curr;
                }

                curr.next = greaternode;
                previousgreater = curr;

                curr = prev.next;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }

        return head;
    }

    // helper to create linked list
    static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // helper to print linked list
    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // main function
    public static void main(String[] args) {
        PartitionList86 obj = new PartitionList86();

        int[] arr = {1, 4, 3, 2, 5, 2};
        int x = 3;

        ListNode head = createList(arr);
        System.out.print("Original List: ");
        printList(head);

        head = obj.partition(head, x);

        System.out.print("Partitioned List: ");
        printList(head);
    }
}
