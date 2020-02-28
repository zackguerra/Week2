package Arrays;

public class BasicArrays2 {
    // (140) Week2/Arrays/BasicArrays2.java
    // http://programmingbydoing.com/

    public static void main(String[] args) {

        int[] arr1 = new int[10];


        for (int i = 0; i < arr1.length; i ++){
            double randomDouble = Math.random();
            randomDouble = randomDouble * 100 + 1;
            int randomInt = (int) randomDouble;
            arr1[i] = randomInt;
        }
        for (int i = 0; i < arr1.length; i ++) {
            System.out.println("Slot "+ i + " contains a " + arr1[i]);
        }
    }

}
