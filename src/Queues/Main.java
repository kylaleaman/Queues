package Queues;

public class Main {
    public static void main(String[] args) {
        // Test QueueArray
        QueueArray queueArray = new QueueArray(5);
        queueArray.enQueue(1);
        queueArray.enQueue(2);
        System.out.println("Dequeued: " + queueArray.deQueue());
        System.out.println("Peek: " + queueArray.peek());

        // Test AnimalShelter
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue("dog");
        shelter.enqueue("cat");
        shelter.enqueue("dog");
        shelter.enqueue("cat");

        System.out.println("Dequeued Any: " + shelter.dequeueAny().type);
        System.out.println("Dequeued Dog: " + shelter.dequeueDog().type);
        System.out.println("Dequeued Cat: " + shelter.dequeueCat().type);
    }
}
