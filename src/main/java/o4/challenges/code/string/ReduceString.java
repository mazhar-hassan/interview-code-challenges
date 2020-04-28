package o4.challenges.code.string;

import o4.challenges.code.test.TestUtils;

public class ReduceString {

    static String superReducedString(String s) {
        int i = 1;

        while (i < s.length()) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                s = s.replace(s.charAt(i)+""+s.charAt(i), "");
                i=0; //restart from beginning
            }
            i++;
        }

        return s.equals("") ? "Empty String" : s;
    }

    public static void main(String[] args) {
        superReducedString("");

        TestUtils.equals(superReducedString("aaabccddd"), "abd");
        TestUtils.equals(superReducedString("abbacddc"), "");
        TestUtils.equals(superReducedString("abbacddcx"), "x");
        TestUtils.equals(superReducedString("aa"), "");
        TestUtils.equals(superReducedString("baab"), "");
    }
}
