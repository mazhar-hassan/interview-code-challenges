package o4.challenges.code.arrays.fagm;

import o4.challenges.code.utils.ArrayUtils;

class FindMaximumContiguousSum {

    public int solution(int[] array) {
        int max = array[0];
        int current = max;
        for (int i = 1; i < array.length; i++) {
            current = Math.max(current + array[i], array[i]);
            max = Math.max(max, current);
        }
        return max;
    }

    public static void main(String[] args) {
        FindMaximumContiguousSum program = new FindMaximumContiguousSum();
        program.checkSolution(new int[]{1, 2, 3, 4, -50, 5, 6});
        program.checkSolution(new int[]{23, -25, 5});
        program.checkSolution(new int[]{1,2,3,4,-2,5});
        program.checkSolution(new int[]{-1, -2, -3, -4, 0, -5, -6});

    }

    public void checkSolution(int[] array) {
        int result = solution(array);
        ArrayUtils.print(array);
        System.out.println(result);
        System.out.println();
    }

}