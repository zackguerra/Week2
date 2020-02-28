package Arrays;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class WhereIsIt {
    // (147) Week2/Arrays/WhereIsIt.java

    public static void main(String[] args) {

        int[] arr1 = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            double randomDouble = Math.random();
            randomDouble = randomDouble * 50 + 1;
            int randomInt = (int) randomDouble;
            arr1[i] = randomInt;
        }

        int max = 0;
        System.out.print("Array: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        Scanner scan = new Scanner(System.in);
        System.out.print("\nValue to find: ");
        int scanNumber = scan.nextInt();

        boolean found = false;
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] == scanNumber){
                System.out.print("\n"+ scanNumber + " is in slot " + i + ".");
                found = true;
            }
        }
        if (!found) {
            System.out.print("\n" + scanNumber + " is not in the array.");
        }
    }
}