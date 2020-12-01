
package class_and_method;

import java.util.ArrayList;

public class ArrayMethods {

    public ArrayList<String> arrsList(String[] array) {

        ArrayList<String> newArray = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            newArray.add(array[i]);
        }

        return newArray;
       
       
   }
          
    
    
}
