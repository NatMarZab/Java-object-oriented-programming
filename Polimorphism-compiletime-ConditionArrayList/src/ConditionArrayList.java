import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class ConditionArrayList extends ArrayList<Integer> {

    //We can overload the constructor to create or manipulate in multiple ways an object depending on the type of inputs and number of parameters.

    private Predicate<Integer> condition;
   /* public ConditionArrayList(Predicate<Integer> predicate, Integer... nums) {
        super(Arrays.stream(nums).filter(predicate).collect(Collectors.toList()));
        this.condition = predicate;
    }

    public ConditionArrayList(Predicate<Integer> predicate, ArrayList<Integer> arrayList) {
        super(arrayList.stream().filter(predicate).collect(Collectors.toList()));
        this.condition = predicate;
    } */

//And we can make a call the other constructor from within the first.

    public ConditionArrayList(Predicate<Integer> predicate, Integer... nums) {
        //From here, we can have the other constructor, so that we use the functionality of List class by calling it directly
        super(new ConditionArrayList(predicate, Arrays.asList(nums)));
    }

    public ConditionArrayList(Predicate<Integer> predicate, List<Integer> arrayList) {
        super(arrayList.stream().filter(predicate).collect(Collectors.toList()));
        this.condition = predicate;
    }


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
