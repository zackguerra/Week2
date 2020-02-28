package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BasicArrayLists2 {
    // (179) Week2/ArrayLists/BasicArrayLists2.java

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;

            arr1.add(randomInt);
        }
        System.out.println("ArrayList: " + arr1);
    }
}
