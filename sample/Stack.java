public class Stack {
   
   private Node head;
   private int count;

   public Stack() {
      head = null;
      count = 0;
   }

   public Node getHead() {
      return head;
   }

   public int getCount() {
      return count;
   }

   public boolean isEmpty() { return count == 0; }

   public void push(Character item) {
      Node p = new Node(item);   
      if (isEmpty()) {
         head = p;
      }
      else {
         p.setNext(head);
         head = p;
      }
      count++;
   }

   public Character pop() {
      Node p = head;
      head = p.getNext();
      p.setNext(null);
      count--;
      return p.getItem();
   }

   public Character top() { return head.getItem(); }

   public Character peek() { return top(); }

}
