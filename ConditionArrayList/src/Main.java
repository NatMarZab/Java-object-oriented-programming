import java.util.ArrayList;
import java.util.Random;

public class Main {

    //we can create common functionality for a variety of different isntance types. For example this one, a function to generate a random number (out of main method!)
    public static void addRandomNumber(ArrayList<Integer> list) {

        int originalSize = list.size();
        Random random = new Random();
        int n = random.nextInt(1000);

        // we can access to the unique functionality of an ConditionArrayList instance with the "instanceOf" operator.
        if(list instanceof ConditionArrayList) {
            ConditionArrayList conditionList = (ConditionArrayList) list;
            while (!conditionList.isEligible(n)) {
                n = random.nextInt(1000);
            }
        }

            list.add(n);
            // we can use .add() method in both instances (oddListy and listy) because they are ArrayLists, they have all the functionality of an ArrayList.
            // But their implementation is different at runtime, depending on the original type of class each instance is. That´s runtime polymorphism.

    }

    public static void main(String[] args) {

        ConditionArrayList oddListy = new ConditionArrayList( n -> Math.abs(n) % 2 == 1);
        oddListy.add(1);
        oddListy.add(2);
        addRandomNumber(oddListy);
        System.out.println(oddListy.size());
        System.out.println(oddListy);

        ConditionArrayList evenListy = new ConditionArrayList( n -> Math.abs(n) % 2 == 0);
        evenListy.add(1);
        evenListy.add(2);
        System.out.println(evenListy);

        ArrayList<Integer> listy = new ArrayList<>();
        listy.add(1);
        listy.add(2);
        addRandomNumber(listy);
        System.out.println(listy.size());
        System.out.println(listy);
    }
}
