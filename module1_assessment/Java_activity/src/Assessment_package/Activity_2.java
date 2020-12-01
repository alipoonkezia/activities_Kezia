
package Assessment_package;


public class Activity_2 {

    public static void main(String[] args) {

        String[][] arrs = new String[10][10];

        for (int row = 0; row < arrs.length; row++) {

            for (int column = 0; column < arrs[row].length; column++) {

                arrs[row][column] = " @";

                System.out.print(arrs[row][column]);
            }
            System.out.println("");
        }
    }
    
}
