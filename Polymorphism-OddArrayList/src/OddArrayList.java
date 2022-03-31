import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class OddArrayList extends ArrayList<Integer> {

    public OddArrayList(Integer... nums) {
        super(Arrays.stream(nums).filter(OddArrayList::isOdd).collect(Collectors.toList()));
    }

    // We will need to override some ArrayList functionality in order to only odd numbers are added.
    // Override function implementations: match the method signatures from the ArraList exactly.

   //The implementation of the following method lives in ArrayList, here we only override it. We access that implmentation in ArrayList through "super" keyword.
    @Override
    public void add(int index, Integer element) {
        if (isOdd(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element) {
        if (isOdd(element)) {
            return super.add(element);
        } else {
            return false;
        }
    }


   // We can override all of these methods to add collections to ArrayList:
    @Override
    public boolean addAll(int index, Collection<? extends Integer > c) {
            return super.addAll(index, c.stream()
                    .filter(OddArrayList::isOdd)
                    .collect(Collectors.toList()));
    }
        // We modify the following set functionality:
    @Override
    public Integer set(int index, Integer element) {
        if (isOdd(element)) {
            return super.set(index, element);
        } else {
            System.out.println(element + "is not odd. ");
            return Integer.MIN_VALUE;
        }
    }
         // Esta sólo acepta elementos válidos y quita inmediatamente los inválidos:
    @Override
    public void replaceAll(UnaryOperator<Integer> operator) {
        super.replaceAll(operator);
        super.removeIf(n -> !isOdd(n));
    }

    // If we have the same condition for all of these methods, we can separate it out.
    public static boolean  isOdd(Integer element) {
        return Math.abs(element) % 2 == 1;
    }

}
