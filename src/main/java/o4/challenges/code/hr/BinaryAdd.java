package o4.challenges.code.hr;

public class BinaryAdd {

    static int toNumber (String binary) {

        int number = 0;
        for (int i=0; i < binary.length(); i++) {
            int c = Character.getNumericValue(binary.charAt(binary.length() - i - 1));

            if (c == 1) {
                number += Math.pow(2, i);
            }
        }

        return number;
    }

    static String binaryAdd(String str1, String str2) {
        System.out.println(str1);
        System.out.println(str2);

        int len = Math.max(str1.length(), str2.length());

        String result = new String();
        String carry = new String();
        int c = 0;
        for (int i = 0; i < len; i++) {
            int a = i > str1.length() - 1 ? 0 : Character.getNumericValue(str1.charAt(str1.length() - 1 - i));
            int b = i > str2.length() - 1 ? 0 : Character.getNumericValue(str2.charAt(str2.length() - 1 - i));

            carry = c + carry;
            int sum = a + b + c;

            c = sum / 2;
            int bit = sum % 2;

            result = bit + result;
        }
        System.out.println(carry);
        System.out.println("-------------------------");
        System.out.println(result);
        System.out.println(toNumber(str1));
        System.out.println(toNumber(str2));
        System.out.println(toNumber(result));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(binaryAdd("101010011", "10101001"));
    }
}
