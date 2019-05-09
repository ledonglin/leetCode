package algorithms;

import java.util.HashMap;

/**
 * 220. Contains Duplicate III
 * Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3, t = 0
 * Output: true
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1, t = 2
 * Output: true
 * Example 3:
 * <p>
 * Input: nums = [1,5,9,1,5,9], k = 2, t = 3
 * Output: false
 * Created by linld on 2019/3/25.
 */
public class Problem220 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};
        int k = 3;
        int t = 0;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t)); //true

//
//        nums = new int[]{1, 2, 3, 1};
//        k = 3;
//        t = 0;
//        System.out.println(containsNearbyAlmostDuplicate(nums, k, t)); //true
//
//        nums = new int[]{1, 0, 1, 1};
//        k = 1;
//        t = 2;
//        System.out.println(containsNearbyAlmostDuplicate(nums, k, t)); //true
//
//        nums = new int[]{1, 5, 9, 1, 5, 9};
//        k = 2;
//        t = 3;
//        System.out.println(containsNearbyAlmostDuplicate(nums, k, t)); //false
//
//        nums = new int[]{7, 1, 3};
//        k = 2;
//        t = 3;
//        System.out.println(containsNearbyAlmostDuplicate(nums, k, t)); //true
//
        System.out.println(Integer.MAX_VALUE);
        System.out.println(2147483647);
        System.out.println(2147483647+1);
        nums = new int[]{-1,2147483647};
        k = 1;
        t = 2147483647;
        System.out.println(containsNearbyAlmostDuplicate(nums, k, t)); //true

    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j <= i + k  && j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) <= t) {
                    return true;
                }
            }
        }

        return false;
    }
}
