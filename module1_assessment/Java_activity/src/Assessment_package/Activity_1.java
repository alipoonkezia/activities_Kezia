
package Assessment_package;


public class Activity_1 {

    public static void arraycopy(int[] from, int fromstart, int[] to, int tostart, int count) {

        for (int i = 0; i < count; i++) {

            to[tostart + i] = from[fromstart + i];
        }

    }

    public static void main(String[] args) {
        int arrs1[] = new int[3];
        int arrs2[] = new int[3];

        arrs1[0] = 2;
        arrs1[1] = 5;
        arrs1[2] = 92;

        arraycopy(arrs1, 0, arrs2, 0, 3);

        for (int i = 0; i < arrs2.length; i++) {
            System.out.println(arrs2[i]);
        }
    }

  
}
