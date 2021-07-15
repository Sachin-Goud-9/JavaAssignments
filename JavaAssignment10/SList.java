public class SList<T> {
    public SNode<T> head;

    public SList(){
        head = new SNode<T>();
    }

    public SListIterator<T> Iterator(){
        return new SListIterator<T>(this);
    }

    public String toString(){
        if(head.data==null){
            return "List is empty";
        }
        else {
            SNode<T> headLoader = this.head;
            String singlyLinkedList = "Single Linked list: ";
            while (headLoader.next != null) {
                singlyLinkedList = singlyLinkedList + headLoader.data.toString() + " ";
                headLoader = headLoader.next;
            }
            singlyLinkedList = singlyLinkedList + headLoader.data.toString() ;
            return singlyLinkedList;
        }
    }
}
