import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ConditionArrayList extends ArrayList<Integer> {

    // we need to add the condition to the costructor. In this case is a Predicate, that takes in a value and returns a boolean.
    // and we want access the condition from different instance methods, for what we keep it in a variable:
    private Predicate<Integer> condition;
    public ConditionArrayList(Predicate<Integer> predicate, Integer... nums) {

        super(Arrays.stream(nums).filter(predicate).collect(Collectors.toList()));
        this.condition = predicate;
    }

    // We will need to override some ArrayList functionality in order to only odd numbers are added.
    // Override function implementations: match the method signatures from the ArraList exactly.

    //The implementation of the following method lives in ArrayList, here we only override it. We access that implmentation in ArrayList through "super" keyword.
    @Override
    public void add(int index, Integer element) {
        if (isEligible(element)) {
            super.add(index, element);
        }
    }

    @Override
    public boolean add(Integer element) {
        if (isEligible(element)) {
            return super.add(element);
        } else {
            return false;
        }
    }


    // We can override all of these methods to add collections to ArrayList:
    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return super.addAll(c.stream()
                .filter(this::isEligible)
                .collect(Collectors.toList()));
    }
    @Override
    public boolean addAll(int index,
                          Collection<? extends Integer> c) {
        return super.addAll(index, c.stream()
                .filter(this::isEligible)
                .collect(Collectors.toList()));
    }

    // We modify the following set functionality:
    @Override
    public Integer set(int index, Integer element) {
        if (isEligible(element)) {
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
        super.removeIf(n -> !isEligible(n));
    }

    // If we have the same condition for all of these methods, we can separate it out.
    public boolean isEligible(Integer element) {
        return condition.test(element);
    }

}

