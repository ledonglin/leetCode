package algorithms;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * <p>
 * <p>
 * A:Why does the HashSet solution perform so bad?
 * S:Complexity only suggests how much the problem will scale. For smaller numbers of N it won't scale enough to
 * matter. The performance also depends on factors such as how well an algorithm works with cache or branching.
 * The tests probably recreate everything each iteration, and that favors anything that requires simpler data structures.
 * </P>
 */
public class Problem217 {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> numSet = new HashSet<>();
        for (int i : nums) {
            numSet.add(i);
        }
        if (nums.length != numSet.size()) {
            return true;
        }

        return false;
    }
}
