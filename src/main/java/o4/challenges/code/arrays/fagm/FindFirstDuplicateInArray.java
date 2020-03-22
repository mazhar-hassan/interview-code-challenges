package o4.challenges.code.arrays.fagm;

import o4.challenges.code.utils.ArrayUtils;

/**
 * Values can only be 1 to N (No zero, N is length or array)
 */
public class FindFirstDuplicateInArray {
    public int solution(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i])-1;
            if (array[index] < 0) {
                return Math.abs(array[i]);
            } else {
                array[index] *= -1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FindFirstDuplicateInArray program = new FindFirstDuplicateInArray();
        program.checkSolution(new int[]{1,2,3,4,2});
        program.checkSolution(new int[]{4, 2, 1, 4});

    }

    public void checkSolution(int[] array) {
        ArrayUtils.print(array);
        int result = solution(array);
        ArrayUtils.print(array);
        System.out.println(result);
        System.out.println();
    }
}
