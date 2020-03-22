package o4.challenges.code.utils;

public class ArrayUtils {
    public static void print(int[] array) {
        if (array == null) {
            System.out.println("{{Null array}}");
        } else if (array.length == 0) {
            System.out.println("{{Empty array}}");
        } else {
            System.out.print("[");
            for (int i=0; i < array.length; i++) {
                System.out.print(array[i]);
                if (i != array.length-1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
    }
}
