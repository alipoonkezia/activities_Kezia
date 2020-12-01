package API_programs;


import java.util.*;




public class java_util {

    public static void main(String[] args) {

        ArrayList<Object> arrsList = new ArrayList<>();

        arrsList.add("abc");
        arrsList.add("deg");
        arrsList.add("hij");
        arrsList.add("klm");
        arrsList.add("nop");
        arrsList.add("qrs");

        for (int i = 0; i < arrsList.size(); i++) {
            System.out.println(arrsList.get(i));
        }

    }
}
