/*
 *Check if given line is pangram
 */
package PangramDetector;

public class Main {

    private static final String LINE = "The quick brown fox jumps over the lazy dog";

    public static void main(String[] args) {
        String formattedLine = LINE.toLowerCase().replaceAll(" ", "");
        boolean flag = false;
        for (char i = 'a'; i <= 'z'; i++) {

            if (formattedLine.contains(String.valueOf(i))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(" Line: " + LINE + " ,is a Pangram");
        } else {
            System.out.println(" Line: " + LINE + " ,is a Pangram");
        }
    }
}
// another solution is to throw all characters to set and check if size is equal to 26.