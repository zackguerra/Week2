package ArrayLists;

import java.util.ArrayList;

public class GettingTheLargestValue {
    // (185) Week2/ArrayLists/GettingTheLargestValue.java

    public static void main(String[] args) {

        ArrayList<Integer> arr1 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;

            arr1.add(randomInt);
        }
        System.out.println("ArrayList: " + arr1);

        int max = 0;
        for (int i = 0; i < arr1.size(); i++) {

            if (max < arr1.get(i)) {
                max = arr1.get(i);
            }
        }
        System.out.print("\nThe largest value is " + max);


    }
}
