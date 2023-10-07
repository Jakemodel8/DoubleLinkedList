/** 
 * A class for a node of a double linked list
 * @author Jake Model
 */
public class DLNode<T> {

    private T element;
    private DLNode<T> next;
    private DLNode<T> prev;

    /** 
     * Constructor for the DLNoe
     * @param T element, DLNode next, DLNode prev 
     */ 
    public DLNode(T element, DLNode<T> next, DLNode<T> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Get next node
     * @return next
     */
    public DLNode<T> getNext() {
        return next;
    }

    /** 
     * Set element
     * @param T element
     */
    public void setElement(T element) {
        this.element = element;
    }

    /**
     * Get element
     * @return T element
     */
    public T getElement() {
        return this.element;
    }

    /** 
     * Set next node
     * @param DLNode<T> next
     */
    public void setNext(DLNode<T> next) {
        this.next = next;
    }

    /**
     * Get previous node
     * @return prev node
     */
    public DLNode<T> getPrev() {
        return this.prev;
    }

    /** 
     * Set previous node
     * @param DLNode<T> prev
     */
    public void setPrev(DLNode<T> prev) {
        this.prev = prev;
    }

}