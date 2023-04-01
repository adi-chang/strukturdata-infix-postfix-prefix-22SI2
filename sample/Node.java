public class Node {
   
   private Character item;
   private Node next;

   public Node(Character item) { this.item = item; }

   public Character getItem() {
      return item;
   }

   public Node getNext() {
      return next;
   }

   public void setItem(Character item) {
      this.item = item;
   }

   public void setNext(Node next) {
      this.next = next;
   }

   @Override
   public String toString() {
      return item.toString();
   }

}
