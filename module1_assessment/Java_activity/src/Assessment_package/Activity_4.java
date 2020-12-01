
package Assessment_package;


public class Activity_4 {

    public static void main(String[] args) {

        String given = "Programming";
        String comp = "ng";
        String temp = given.substring(given.length() - 2, given.length());
        System.out.println("The Given strings is: " + given);
        System.out.println("The string containing " + comp + " at last: " + temp.equals(comp));
    }
}
