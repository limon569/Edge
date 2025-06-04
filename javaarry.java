import java.util.*;

public class UsingArrays {

    private int intValues[] = { 1, 2, 3, 4, 5, 6 };

    private double doubleValues[] = { 8.4, 9.3, 0.2, 7.9, 3.4 };

    private int filledInt[], intValuesCopy[];

    // initialize arrays

    public UsingArrays() {

        filledInt = new int[10];

        intValuesCopy = new int[intValues.length];

        Arrays.fill(filledInt, 7); // fill with 7s
        Arrays.sort(doubleValues); // sort doubleValues ascending

        // copy array intValues into array intValuesCopy
        System.arraycopy(intValues, 0, intValuesCopy, 0, intValues.length);
    }
}