import java.util.ArrayList;

public class ModArrayList<D> extends ArrayList<D> {

    // We use the reference D, as in the class signature.
        public D getUsingMod(int index) {
            // To make the index positive, we use Math.abs():
            int validIndex = Math.abs(index) % this.size();

            // DOUBT: I don´t understand why I have to use a getter here.
            return this.get(validIndex);

        }
}
