// // Add a node at the front in a Doubly Linked List:
// public void push(int new_data){
// Node new_node = new Node(new_data);

// // make next of new node as head and previous as NULL
// new_node.next =head;
// new_node.prev = null;

// // change prev of head node to new node
// if(head!=null){
// head.prev = new_Node;
// }

// // move the head to point to the new node
// head = new_node;
// }

///////////////////////////////////////////////////////////////
////// Add a node in between two nodes:
// After a given node
// public void InsertAfter(Node prev_Node ,int new_data){
// // chech if the given node prev_node is NULL
// if( prev_node == null){
// System.out.println("The given previous node cannot be NULL");
// return;
// }

// // allocate the node
// // put in the data
// Node new_node = new Node(new_data);

// // Make next of the new node as next of prev_node
// new_node .next = prev_Node.next;

// // make the next of prev_node as new_node
// prev_node.next = new_node;

// // make prev_node as previous of new_node
// new_node.prev = prev_Node;

// // change previous of new_node's next node
// if(new_node.next !=null){
// new_node.next.prev = new_node;
// }
// }

/////////////////////////////////
// Before a given node:
// public void InsertBefore( Node next_Node, int new_data){
// // check if the given next_node is NULL
// if(next_Node == null){
// System.out.println("The given next node cannot be null");
// return ;
// }

// // allocate node
// // put in the data
// Node new_node = new Node(new_data);

// // make previous of new node as previous of next_node
// new_node.prev = next_Node.prev;

// // make the prev of next_node as new_node
// next_Node.prev= new_node;

// // make next_node as next of new_node
// new_node.next = next_Node;

// // change next of new_node's previous node
// if(new_node.prev !=null){
// new_node.prev.next = new_node;
// }
// else{
// head = new_node;
// }
// }

/////////////////////////////////////////////////////////////
// Add a node at the end in DLL
// void append(int new_data){
// // allocate node
// // put in the data
// Node new_node = new Node(new_data);

// Node last = head ;

// // this new node is going to be the last node, so make next of it as NULL
// new_node.next= null;

// // if the linked list is empty, then make the neew node as head.
// if( head ==null){
// new_node .prev = null;
// head = new_node;
// return;
// }

// // traverse till the last node
// while(last.next!= null){
// last= last.next;
// }

// // Change the next of last node
// last.next = new_node;

// // make last node a previous of new node
// new_node .prev = last;

// }

//////////////////////////////////////////////////////
// Deleteing a node from doubly linked list
// public class Main {
//   static Node head;

//   class Node {
//     int data;
//     Node next;
//     Node prev;

//     Node(int d) {
//       data = d;
//     }
//   }

//   // adding a node at the front of the list
//   public void push(int data) {
//     Node new_node = new Node(data);

//     new_node.next = head;
//     new_node.prev = null;

//     // change prev of head node to new node
//     if (head != null) {
//       head.prev = new_node;
//     }
//     head = new_node;
//   }

//   public void printList(Node node) {
//     Node last = null;

//     while (node != null) {
//       System.out.print(node.data + " ");
//       last = node;
//       node = node.next;
//     }
//     System.out.println();
//   }

//   void deleteNode(Node del) {
//     // base case
//     if (head == null || del == null) {
//       return;
//     }

//     // if node to be deleted is head node
//     if (head == del) {
//       head = del.next;
//     }

//     // chnage next only if node to be deleted is NOT the last node
//     if (del.next != null) {
//       del.next.prev = del.prev;
//     }

//     // change prev only if node to be deleted is NOT the first node
//     if (del.prev != null) {
//       del.prev.next = del.next;
//     }

//     // finally, free the memory occupied by del
//     return;
//   }

//   public static void main(String[] args) {
//     Main dll = new Main();

//     dll.push(2);
//     // Insert 4. So linked list becomes 4->2->NULL
//     dll.push(4);

//     // Insert 8. So linked list becomes 8->4->2->NULL
//     dll.push(8);

//     // Insert 10. So linked list becomes
//     // 10->8->4->2->NULL
//     dll.push(10);

//     System.out.print("Original Linked List");
//     dll.printList(head);

//     dll.deleteNode(head); /* delete first node */
//     dll.deleteNode(head.next); /* delete middle node */
//     dll.deleteNode(head.next); /* delete last node */

//     System.out.print("\n Modified Linked List ");
//     dll.printList(head);

//   }
// }

//////////////////////////////////////////////////////
// Reversing a Doubly Linked list
class Main {
  static Node head;

  static class Node {
    int data;
    Node next, prev;

    Node(int d) {
      data = d;
      next = prev = null;
    }
  }

  void reverse() {
    Node temp = null;
    Node current = head;

    while (current != null) {
      temp = current.prev;
      current.prev = current.next;
      current.next = temp;
      current = current.prev;
    }

    // before changing head, check for the cases like empty list and list with only
    // one node
    if (temp != null) {
      head = temp.prev;
    }
  }

  void push(int new_data) {
    Node new_node = new Node(new_data);

    new_node.prev = null;

    new_node.next = head;

    if (head != null) {
      head.prev = new_node;
    }

    head = new_node;
  }

  void printList(Node node) {
    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }
  }

  public static void main(String[] args) {
    Main list = new Main();

    list.push(2);
    list.push(4);
    list.push(8);
    list.push(10);

    System.out.println("Original linked list ");
    list.printList(head);

    list.reverse();

    System.out.println("");
    System.out.println("The reversed Linked List is ");
    list.printList(head);
  }
}