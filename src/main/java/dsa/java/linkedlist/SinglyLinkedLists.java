package dsa.java.linkedlist;


public class SinglyLinkedLists<T> {
  public class Node<A> {
    public A val;
    public Node<A> next;

    public Node() {}

    public Node(A val) {
      this.val = val;
    }
  }

}
