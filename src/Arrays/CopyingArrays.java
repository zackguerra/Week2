package Arrays;

import java.util.Arrays;

public class CopyingArrays {
    // (142) Week2/Arrays/CopyingArrays.java

    public static void main(String[] args) {

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i ++){
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr1[i] = randomInt;
        }

        int[] arr2 = arr1.clone();

        arr1[arr1.length - 1] = -7;

        System.out.print("Array 1: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print("\n");
        System.out.print("Array 2: ");
            for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}