package com.sunny.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 数字计算相关的 LeetCode
 *
 * @since  2023/06/11
 */
public class SumNumber {

    /**
     * 两数之和
     * leetcode 1
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hasMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hasMap.containsKey(target - nums[i])) {
                return new int[]{hasMap.get(target - nums[i]), i};
            }
            hasMap.put(nums[i], i);
        }
        return null;
    }

}
