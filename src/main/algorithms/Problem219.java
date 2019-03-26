package algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 219. Contains Duplicate II
 * Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 * <p>
 * Created by linld on 2019/3/25.
 */
public class Problem219 {
    /**
     * Success
     * Details
     * Runtime: 8 ms, faster than 86.07% of Java online submissions for Contains Duplicate II.
     * Memory Usage: 41 MB, less than 76.92% of Java online submissions for Contains Duplicate I
     *
     * @param nums
     * @param k
     * @return
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (numMap.containsKey(nums[i])) {
                Integer position = numMap.get(nums[i]);
                if (i - position <= k) {
                    return true;
                }
            }
            numMap.put(nums[i], i);
        }

        return false;
    }
}
