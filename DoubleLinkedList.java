/** 
 * A double linked list class
 * @author Jake Model
 */


public class DoubleLinkedList<T> {

    private DLNode<T> head;
    private DLNode<T> tail;

    // Constructor for class
    public DoubleLinkedList(){
        head = tail = null;
    }

    /**
     * return head of DLL
     * @return head
     */
    public DLNode<T> getHead() {
        return this.head;
    }

    /**
     * Set head of DLL
     * @param head
     */
    public void setHead(DLNode<T> head) {
        this.head = head;
    }

    /**
     * Get tail of DLL
     * @return tail
     */
    public DLNode<T> getTail() {
        return this.tail;
    }

    /**
     * Set tail of DLL
     * @param tail
     */
    public void setTail(DLNode<T> tail) {
        this.tail = tail;
    }

    /**
     * Add a node to DLL
     * @param node
     */
    public void add(DLNode<T> node) {
        if (head == null) {
            head = tail = node;
        }
        else {
            tail.setNext(node);
            node.setPrev(tail);
            setTail(node);
        }
    }

    /**
     * Swap a node with its successor
     * @param node
     */
    public void swap(DLNode<T> node) {
        DLNode<T> index = head;

        // Find the node
        while (index != node || index.getNext() != null) {
            index = index.getNext();
        }

        // Case 1, node is not near an edge
        if ((index.getNext() != null) && (index != head) && (index != tail)) {
            index.getNext().getNext().setPrev(index);
            index.getPrev().setNext(index.getNext());
            index.getNext().setPrev(index.getPrev());
            index.setPrev(index.getNext());
            index.setNext(index.getNext().getNext());
        }
        // Case 2, node is head
        else if ((index.getNext() != null) && (index == head)) {
            index.getNext().getNext().setPrev(index);
            setHead(index.getNext());
            head.setNext(index);
            head.setPrev(null);
            index.setPrev(index.getNext());
            index.setNext(index.getNext().getNext());
        }
        // Case 3, node is tail
        else if ((index.getNext() != null) && (index.getNext() == tail)) {
            setTail(node);
            node.getNext().setNext(node);
            node.getNext().setPrev(node.getPrev());
            node.setPrev(node.getNext());
            node.setNext(null);
        }
        // Case 4, node is head, successor is tail
        else if ((index == head) && (index.getNext() == tail)) {
            setHead(node.getNext());
            setTail(node);
            node.setPrev(node.getNext());
            node.setNext(null);
            node.getPrev().setPrev(null);
            node.getPrev().setNext(node);
        }
    }
}
