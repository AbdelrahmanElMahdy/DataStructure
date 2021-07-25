import java.util.Arrays;
import java.util.EmptyStackException;

public class QWithArray {
    private int inizise = 5;
    private int[] queue;
    private int front = 0, rear = 0;


    public QWithArray() {
        this.queue = new int[this.inizise];
    }

    public void enqueue(int item) {
        if (isFull())
            throw new StackOverflowError("queue is full");
        else if (rear == queue.length && front != 0)
            rear = 0;
        queue[rear++] = item;

    }

    public int dequeue() {
        if (isEmpty())
            throw new EmptyStackException();
        if (front == queue.length)
            front = 0;
        return queue[front++];

    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return (rear == queue.length && front == 0) ||
                (front == rear + 1);
    }

    @Override
    public String toString() {

            return Arrays.toString(queue);

    }
}
