package o4.challenges.code.ds.practise;

import java.util.HashMap;
import java.util.Map;

public class AreTheyEqual {
    static String areTheyEqual(int[] array_a, int[] array_b) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i=0; i < array_a.length; i++) {
            if (!map.containsKey(array_a[i])) {
                map.put(array_a[i], 0);
            }
            map.put(array_a[i], map.get(array_a[i]) + 1);
        }

        for (int i=0; i < array_b.length; i++) {
            if (!map.containsKey(array_b[i]) || map.get(array_b[i]) <= 0) {
                return "No";
            } else {
                map.put(array_b[i], map.get(array_b[i]) - 1);
            }
        }
        return "Yes";

    }

    public static void main(String[] args) {
        int[] array_a_2 = {1, 2, 3, 4};
        int[] array_b_2 = {1, 4, 3, 3};
        System.out.println(areTheyEqual(array_a_2, array_b_2));
    }
}
