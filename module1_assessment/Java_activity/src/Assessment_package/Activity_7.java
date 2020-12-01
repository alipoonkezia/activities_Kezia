
package Assessment_package;

import java.io.File;


public class Activity_7 {
    
    public static void main(String[] args) {
        File myfile = new File("D:\\MUSIC");

        String[] files = myfile.list();

        for (int i = 0; i < files.length; i++) {

            System.out.println(files[i]);
        }
    }
}
