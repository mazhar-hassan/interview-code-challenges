package o4.challenges.code.string;

import o4.challenges.code.test.TestUtils;

public class StrongPassword {
    static int minimumNumber(String password) {
        // Return the minimum number of characters to make the password strong

        //[ special|digit|upper|lower]
        int conditions = 0;
        int count = 0;

        for (int i = 0; i < password.length(); i++) {

            if (count == 4) {
                break;
            } else if ( (conditions & 2) == 0  && password.charAt(i) >= 'A' && password.charAt(i) <= 'Z') {
                count++;
                conditions |= 2;
            } else if ( (conditions & 1) == 0  && password.charAt(i) >= 'a' && password.charAt(i) <= 'z') {
                count++;
                conditions |= 1;
            } else if ( (conditions & 4) == 0  && password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                count++;
                conditions |= 4;
            } else if ( (conditions & 8) == 0  && "!@#$%^&*()-+".contains(password.charAt(i)+"")) {
                count++;
                conditions |= 8;
            }
        }

        /*int len = 0;
        if (password.length() >= 6) {
            len = 4 - count;
        } else {
            len = Math.max(6-password.length(),4-count);
        }
        */
        return Math.max(6-password.length(),4-count);
    }

    public static void main(String[] args) {
        TestUtils.equals(minimumNumber("#MazharHassan"), 1);
        TestUtils.equals(minimumNumber(""), 6);
        TestUtils.equals(minimumNumber("#Ma6"), 2);
    }
}
