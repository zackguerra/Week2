package Arrays;

public class FindingTheLargestValue {
    // (148) Week2/Arrays/FindingTheLargestValue.java

    public static void main(String[] args) {

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i ++){
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr1[i] = randomInt;
        }

        int max = 0;
        System.out.print("Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");

            if (max < arr1[i]) {
                max = arr1[i];
            }
        }
        System.out.print("\n");
       System.out.print("\nThe largest value is " + max);

    }
}
