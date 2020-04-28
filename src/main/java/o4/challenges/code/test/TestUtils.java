package o4.challenges.code.test;

public class TestUtils {
    public static void equals(String expected, String actual) {
        if (!expected.equals(actual)) {
            System.err.println("Expecting ["+expected+"] but received ["+actual+"]");
        } else {
            System.out.println("Matched ["+expected+"] = ["+actual+"]");
        }
    }

    public static void equals(int expected, int actual) {
        if (expected != actual) {
            System.err.println("Expecting ["+expected+"] but received ["+actual+"]");
        } else {
            System.out.println("Matched: " + actual);
        }
    }
}
