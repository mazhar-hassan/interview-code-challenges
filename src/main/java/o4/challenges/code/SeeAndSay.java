package o4.challenges.code;

import org.junit.jupiter.api.Test;

public class SeeAndSay {

    private String toVal(String value) {
        StringBuilder result = new StringBuilder();
        int last = -1;
        int count = 0;
        int n = 0;
        for (int i=0; i < value.length(); i++) {
            n = Character.getNumericValue(value.charAt(i));
            if (last == -1 || last == n) {
                count++;
                last = n;
            } else if (last != n) {
                result.append(count);
                result.append(last);
                count = 1;
                last = n;
            }
        }
        if (count != 0) {
            result.append(count);
            result.append(n);
        }
        return result.toString();
    }

    public void solution(int count) {
        String value = "1";
        System.out.println(value);
        for (int i=0; i< count; i++) {
            value = toVal(value);
            System.out.println(value);
        }
    }

    @Test
    public void testSolution() {
        solution(5);
    }
}
