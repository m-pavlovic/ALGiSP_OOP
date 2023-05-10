package pckg_adt_queue;

public interface ADTQUEUE<E> {

    /**
     * Gives size of the queue
     * @return size
     */
    int size();

    /**
     * Provides first element but does not
     * remove it from the queue
     * @return first
     */
    E first();

    /**
     * Puts new element at the end of the queue
     * @param element
     */
    void enqueue(E element);

    /**
     * Gives and removes first element from the queue
     * @return element
     */
    E dequeue();

    /**
     * Checks if queue is empty
     * @return true if empty, false otherwise
     */
    boolean isEmpty();
}
