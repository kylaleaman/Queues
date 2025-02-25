package Queues;

public class QueueArray {
    private int[] arr;
    private int backOfQueue;
    private int nItems;
    private int beginningOfQueue;

    public QueueArray(int size) {
        this.arr = new int[size];
        this.backOfQueue = -1;
        this.beginningOfQueue = -1;
        this.nItems = 0;
        System.out.println("The Queue is successfully created with size of: " + size);
    }

    // isFull
    public boolean isFull() {
        return (backOfQueue == arr.length - 1);
    }

    // isEmpty
    public boolean isEmpty() {
        return (nItems == 0);
    }

    // Enqueue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            backOfQueue++;
            nItems++;
            arr[backOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }

    // Dequeue
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        } else {
            int result = arr[beginningOfQueue];
            beginningOfQueue++;
            if (beginningOfQueue > backOfQueue) {
                beginningOfQueue = backOfQueue = -1;
            }
            nItems--;
            return result;
        }
    }

    // Peek
    public int peek() {
        if (!isEmpty()) {
            return arr[beginningOfQueue];
        } else {
            System.out.println("The Queue is empty");
            return -1;
        }
    }

    // Delete
    public void deleteQueue() {
        arr = null;
        System.out.println("The queue is successfully deleted");
    }
}
