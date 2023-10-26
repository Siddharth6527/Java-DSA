public class Debug {
  static class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
      this.val = val;
      this.next = null;
    }

    ListNode() {
      new ListNode(0);
    }

    @Override
    public String toString() {
      return printLinkedList(this);
    }
  }

  public static ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }

    ListNode curr = head;
    ListNode prev = null;

    while (curr != null) {
      ListNode nextTemp = curr.next;
      curr.next = prev;
      prev = curr;
      curr = nextTemp;
    }
    return prev;
  }

  public static void main(String[] args) {
    ListNode head = convertArrayToLinkedList(new int[] { 1, 2, 3, 4, 5 });
    System.out.println(printLinkedList(head));
    head = reverseList(head);
    System.out.println(printLinkedList(head));
  }

  private static String printLinkedList(ListNode head) {
    StringBuilder sb = new StringBuilder();
    while (head != null) {
      sb.append(head.val + ", ");
      head = head.next;
    }
    return sb.substring(0, sb.length() - 2);
  }

  private static ListNode convertArrayToLinkedList(int[] input) {
    ListNode head = new ListNode();
    ListNode dummy = head;
    for (int num : input) {
      ListNode temp = new ListNode(num);
      head.next = temp;
      head = head.next;
    }
    return dummy.next;
  }
}
