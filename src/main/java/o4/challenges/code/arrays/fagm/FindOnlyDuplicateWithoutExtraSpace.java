package o4.challenges.code.arrays.fagm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/*
Assume there is a must duplicate
number 1 to N (no zero, and N is length of array)

 */
public class FindOnlyDuplicateWithoutExtraSpace {

    public int solution(int[] array) {

        int slow = array[0];
        int fast = array[array[0]];
        System.out.println(slow + " === " + fast);
        while (slow != fast) {
            slow = array[slow];
            fast = array[array[fast]];
            System.out.println(slow + "=======" + fast);
        }
        //until here we know there is a cycle
        //both slow and fast crossed on this point
        //but what was the duplicate number

        System.out.println("--------------");
        slow = 0;
        System.out.println(slow + "=======" + fast);
        while (slow != fast) {
            slow = array[slow];
            fast = array[fast];
            System.out.println(slow + "=======" + fast);
        }

        return slow;
    }

    @Test
    public void checkSolution() {
        assertEquals(2, solution(new int[]{1, 2, 3, 4, 5, 2}));
        System.out.println();
        System.out.println();
        assertEquals(2, solution(new int[]{1, 3, 4, 2, 2}));
    }
}
