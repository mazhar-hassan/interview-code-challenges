package o4.challenges.code.string;

import o4.challenges.code.test.TestUtils;

public class CamelCaseCounter {
    static int camelcase(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }
        int counter = 1;
        for (int i=1; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        TestUtils.equals(camelcase("ThisIsThe"), 3);
        TestUtils.equals(camelcase("This"), 1);
        TestUtils.equals(camelcase("howCouldItHaveBeenShould"), 6);

    }
}
