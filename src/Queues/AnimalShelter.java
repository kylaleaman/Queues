package Queues;

import java.util.LinkedList;

class Animal {
    String type;
    int order;

    Animal(String type, int order) {
        this.type = type;
        this.order = order;
    }
}

public class AnimalShelter {
    private LinkedList<Animal> dogs;
    private LinkedList<Animal> cats;
    private int order;

    public AnimalShelter() {
        dogs = new LinkedList<>();
        cats = new LinkedList<>();
        order = 0;
    }

    // Enqueue
    public void enqueue(String type) {
        if (type.equals("dog")) {
            dogs.add(new Animal("dog", order++));
        } else if (type.equals("cat")) {
            cats.add(new Animal("cat", order++));
        } else {
            System.out.println("Unknown animal type");
        }
    }

    // Dequeue Any
    public Animal dequeueAny() {
        if (dogs.isEmpty() && cats.isEmpty()) {
            System.out.println("The shelter is empty");
            return null;
        } else if (dogs.isEmpty()) {
            return cats.poll();
        } else if (cats.isEmpty()) {
            return dogs.poll();
        } else {
            if (dogs.peek().order < cats.peek().order) {
                return dogs.poll();
            } else {
                return cats.poll();
            }
        }
    }

    // Dequeue Dog
    public Animal dequeueDog() {
        if (dogs.isEmpty()) {
            System.out.println("No dogs available");
            return null;
        } else {
            return dogs.poll();
        }
    }

    // Dequeue Cat
    public Animal dequeueCat() {
        if (cats.isEmpty()) {
            System.out.println("No cats available");
            return null;
        } else {
            return cats.poll();
        }
    }
}
