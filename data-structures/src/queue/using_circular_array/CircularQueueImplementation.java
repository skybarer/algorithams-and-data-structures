package queue.using_circular_array;

/**
 * @author : akashdhar
 * @date : 18-05-2019
 * @time : 11:57 PM
 */
public class CircularQueueImplementation {

    public static void main(String[] args) {

        Queue<Integer> circularQueue = new Queue<>(8);

        circularQueue.enqueue(15);
        circularQueue.enqueue(16);
        circularQueue.enqueue(17);
        circularQueue.enqueue(18);
        circularQueue.enqueue(19);
        circularQueue.enqueue(20);
        circularQueue.enqueue(21);
        circularQueue.enqueue(22);

        System.out.println("Full Circular Queue" + circularQueue);

        System.out.print("Dequeued following element from circular Queue ");
        System.out.println(circularQueue.dequeue() + " ");
        circularQueue.enqueue(23);
        System.out.println("After enqueueing circular queue with element having value 23");
        System.out.println(circularQueue);
    }

}