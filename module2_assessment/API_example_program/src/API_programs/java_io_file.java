
package API_programs;

import java.io.File;


public class java_io_file {

    public static void main(String[] args) {
        File myfile = new File("D:\\MUSIC");

        String[] files = myfile.list();

        for (int i = 0; i < files.length; i++) {

            System.out.println(files[i]);
        }
    }
}
