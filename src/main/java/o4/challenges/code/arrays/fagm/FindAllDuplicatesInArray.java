package o4.challenges.code.arrays.fagm;

import o4.challenges.code.utils.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Values can only be 1 to N (No zero, N is length or array)
 */
public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        FindAllDuplicatesInArray program = new FindAllDuplicatesInArray();
        program.checkSolution(new int[]{1, 2, 3, 4, 2});
        program.checkSolution(new int[]{4, 2, 1, 4, 3, 2});

    }

    public List<Integer> solution(int[] array) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i]) - 1;
            if (array[index] < 0) {
                result.add(Math.abs(array[i]));
            }
            array[index] = -array[index];

        }
        return result;
    }

    public void checkSolution(int[] array) {
        ArrayUtils.print(array);
        List<Integer> result = solution(array);
        ArrayUtils.print(array);
        System.out.println(result);
        System.out.println();
    }
}
