package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class FindingValueInArrayList {
    // (182) Week2/ArrayLists/FindingValueInArrayList.java

    public static void main(String[] args) {

    ArrayList<Integer> arr1 = new ArrayList<>();


    for (int i = 0; i < 10; i++) {
        double randomDouble = Math.random();
        randomDouble = randomDouble * 100 + 1;
        int randomInt = (int) randomDouble;

        arr1.add(randomInt);
    }
    System.out.println("ArrayList: " + arr1);

    Scanner scan = new Scanner(System.in);
    System.out.print("Value to find: ");
    int scanNumber = scan.nextInt();

    boolean found = false;

    for (int i = 0; i < arr1.size(); i++) {
        if (arr1.get(i) == scanNumber) {
            System.out.print("\n"+ scanNumber + " is in the ArrayList.");
            found = true;
        }
    }
    if (!found) {
        System.out.print("\n" + scanNumber + " is not in the ArrayList.");
    }




    }
}
