



public class SListIterator<T> {

    private SNode<T> head;

    public SListIterator(SList<T> sList) {
        this.head = sList.head;

    }


    public void add(T data) {
        SNode<T> headLoader = head;
        if (!this.isEmpty()) {
            SNode<T> node = new SNode<T>(data);
            while (headLoader.next != null) {
                headLoader = headLoader.next;
            }
            headLoader.next = node;
        } else {
            headLoader.data = data;
            headLoader.next = null;
        }

    }


    public void remove() {
        SNode<T> headLoader = head;
        SNode<T> prevNode = new SNode<T>();
        if (headLoader.next == null) {
            headLoader.data = null;
        } else {
            while (headLoader.next != null) {
                prevNode = headLoader;
                headLoader = headLoader.next;
            }

            prevNode.next = null;
        }
    }

    public Boolean isEmpty(){
        if(head.data == null){
            return true;
        }
        else
            return false;
    }

}