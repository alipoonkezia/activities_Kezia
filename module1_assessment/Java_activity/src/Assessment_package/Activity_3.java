
package Assessment_package;

import java.util.Random;


public class Activity_3 {

    public static void main(String[] args) {

        int[] arrs = new int[5];

        Random rand = new Random();

        for (int i = 0; i < arrs.length; i++) {

            arrs[i] = rand.nextInt(101);
        }

        float sum = 0;
        float avg = 0;

        for (int i = 0; i < arrs.length; i++) {

            sum = sum + arrs[i];
            avg = sum / arrs.length;
            System.out.println(arrs[i]);

        }
        System.out.println("The Total Average is: " + avg);
    }
}
