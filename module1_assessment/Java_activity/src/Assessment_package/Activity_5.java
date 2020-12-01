
package Assessment_package;


public class Activity_5 {

    public static void main(String[] args) {

        String text = "the quick brown fox";
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) != ' ' && text.charAt(i) != 'q' && text.charAt(i) != 'u'
                    && text.charAt(i) != 'e' && text.charAt(i) != 'e' && text.charAt(i) != 'n') {

                System.out.print(text.charAt(i));

            }

        }
    }
}

