
package class_and_method;

import java.util.ArrayList;


public class MainClass2 {
    public static void main(String[] args) {

        ArrayMethods methods = new ArrayMethods();

        ArrayList<String> arrs = new ArrayList<>();

        String[] myString = new String[3];

        myString[0] = "Result";
        myString[1] = "Result 1";
        myString[2] = "Result 2";

        arrs = methods.arrsList(myString);

        for (int i = 0; i < arrs.size(); i++) {

            System.out.println(arrs.get(i));
        }

    }
}
