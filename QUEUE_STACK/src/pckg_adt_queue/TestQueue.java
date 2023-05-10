package pckg_adt_queue;

public class TestQueue {

    public static void main(String[] args) {
        QUEUEARR<String> queue = new QUEUEARR<>(5);
        queue.enqueue("A");
        queue.enqueue("B");
        queue.enqueue("C");
        queue.enqueue("D");
        queue.enqueue("E");
        queue.enqueue("F");
        System.out.println(queue);
        String inProcess;
        inProcess = queue.dequeue();
        System.out.println("In process: " + inProcess);
        System.out.println(queue);
        queue.enqueue("F");
        System.out.println(queue);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue);
    }
}
