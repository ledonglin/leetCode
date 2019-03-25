package algorithms;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Problem1 {


    public static void main(String args[]) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        Problem1 p = new Problem1();
        int[] result = p.twoSum(nums, target);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int length = nums.length;

        for (int i = 0; i < length; i++) {
            int one = nums[i];
            int two = target - one;
            if (map.containsKey(two)) {
                return new int[]{ map.get(two),i};
            } else {
                map.put(one, i);
            }
        }


        return null;
    }
}
