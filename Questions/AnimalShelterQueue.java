import java.util.*;

public class AnimalShelterQueue {
    public static void main(String[] args) {
        AnimalQueue aq = new AnimalQueue();

        aq.enqueue("dog");
        aq.enqueue("dog");
        aq.enqueue("cat");
        aq.enqueue("cat");
        aq.enqueue("cat");
        aq.enqueue("dog");
        aq.enqueue("cat");
        aq.enqueue("dog");
        aq.enqueue("dog");
        aq.enqueue("cat");
        aq.enqueue("dog");
        aq.enqueue("dog");

        System.out.println(aq.dequeueAny());
        System.out.println(aq.dequeueAny());
        System.out.println(aq.dequeueDog());
        System.out.println(aq.dequeueCat());
        System.out.println(aq.dequeueAny());
        

    }

    public static class AnimalQueue {

        LinkedList<Integer> llDog = new LinkedList<>();
        LinkedList<Integer> llCat = new LinkedList<>();
        int arrivalTime = 0;

        public void enqueue(String typeOfAnimal) {
            if (typeOfAnimal.equals("dog")) {
                llDog.add(arrivalTime++);
            } else {
                llCat.add(arrivalTime++);
            }
        }

        public String dequeueAny() {
            if (llDog.get(0) < llCat.get(0)) {
                return "Animal-" + llDog.remove(0) + " Dog";
            } else {
                return "Animal-" + llCat.remove(0) + " Cat";
            }
        }

        public String dequeueDog() {
            return "Animal-" + llDog.remove(0) + " Dog";
        }

        public String dequeueCat() {
            return "Animal-" + llCat.remove(0) + " Cat";
        }

    }
}