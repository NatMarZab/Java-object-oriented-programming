import java.util.ArrayList;
import java.util.Random;

public class Main {

    //we can create common functionality for a variety of different isntance types. For example this one, a function to generate a random number (out of main method!)
    public static void addRandomNumber(ArrayList<Integer> list) {
        int originalSize = list.size();
        Random random = new Random();
        while (originalSize + 1 != list.size()) { //To make sure that a number is always added.
            int n = random.nextInt(1000);
            list.add(n);
            // we can use .add() method in both instances (oddListy and listy) because they are ArrayLists, they have all the functionality of an ArrayList.
            // But their implementation is different at runtime, depending on the original type of class each instance is. That´s runtime polymorphism.
        }

    }

    public static void main(String[] args) {

        OddArrayList oddListy = new OddArrayList(7);
        oddListy.add(1);
        oddListy.add(2);
        addRandomNumber(oddListy);
        System.out.println(oddListy.size());
        System.out.println(oddListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        addRandomNumber(listy);
        System.out.println(listy.size());
        System.out.println(listy);
    }
}
