public class RotateList61 {

  // Definition for singly-linked list
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }
  }

  public static ListNode rotateRight(ListNode head, int k) {
    if (head == null || head.next == null || k == 0) {
      return head;
    }

    // 1. Find length and last node
    ListNode curr = head;
    int length = 1;
    while (curr.next != null) {
      curr = curr.next;
      length++;
    }

    // 2. Reduce k
    k = k % length;
    if (k == 0) return head;

    // 3. Make circular
    curr.next = head;

    // 4. Find new tail
    int stepsToNewTail = length - k;
    ListNode newTail = head;
    for (int i = 1; i < stepsToNewTail; i++) {
      newTail = newTail.next;
    }

    // 5. Break circle
    ListNode newHead = newTail.next;
    newTail.next = null;

    return newHead;
  }

  // Helper function to print list
  public static void printList(ListNode head) {
    while (head != null) {
      System.out.print(head.val + " -> ");
      head = head.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    // Input: 1 -> 2 -> 3 -> 4 -> 5, k = 2
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);
    head.next.next.next.next = new ListNode(5);

    System.out.print("Original List: ");
    printList(head);

    head = rotateRight(head, 2);

    System.out.print("After Rotation: ");
    printList(head);
  }
}
