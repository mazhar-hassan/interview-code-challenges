package o4.challenges.code.ds.fk;

public class OneChangeMatch {

    public static void main(String[] args) {
        //Assertions.assertEquals(solutoin;

        System.out.println(solution("abt", "tab") == false);
        System.out.println(solution("cat", "dog") == false);
        System.out.println(solution("cat", "cats") == true);
        System.out.println(solution("cat", "cut") == true);
        System.out.println(solution("cat", "cast") == true);
        System.out.println(solution("cat", "at") == true);
        System.out.println(solution("cat", "act") == false);
    }

    static boolean solution(String first, String second) {

        boolean response = true;
        if (Math.abs(first.length() - second.length()) > 1) {
            response =  false;
        } else if (first.contains(second) || second.contains(first)) {
            response = true;
        } else {

            int mismatch = 0;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (mismatch > 0) {
                        response = false;
                        break;
                    }
                    mismatch++;
                }
            }
        }
        System.out.println(first+"->"+second+" == "+response);
        return response;
    }
}
