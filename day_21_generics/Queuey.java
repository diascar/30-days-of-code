import java.util.LinkedList;

public class Queuey<T> {

    LinkedList<T> queue;

    public Queuey() {
        queue = new LinkedList();
    }

    //enqueueing a item
    public void enqueue(T newItem) {
        this.queue.addLast(newItem);
    }

    public T dequeue() {
        return this.queue.remove(0); 
    }

    public T peek() {
        return this.queue.get(0);
    }

    public static void main(String[] args) {
        
        Queuey stringQueue = new Queuey();
        stringQueue.enqueue("hi");
        stringQueue.enqueue("there");
        System.out.println(stringQueue.dequeue());
        System.out.println(stringQueue.dequeue());

    }
}