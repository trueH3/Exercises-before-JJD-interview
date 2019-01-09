package PalindromChecker;

public class PalindromNumber {

    public static void main(String[] args) {
        check(333);
    }

    private static void check(int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(i));
        sb.reverse();
        if (sb.toString().equals(String.valueOf(i))) {
            System.out.println("Number is palindrom");
        } else {
            System.out.println("Number is not a palindrom");
        }

    }
}
