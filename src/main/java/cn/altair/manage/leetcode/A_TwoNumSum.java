package cn.altair.manage.leetcode;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * <p>
 * 示例1:
 * <p>
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1]
 * <p>
 * <p>
 * 示例 2：
 * <p>
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * <p>
 * <p>
 * 示例 3：
 * <p>
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 103
 * -109 <= nums[i] <= 109
 * -109 <= target <= 109
 * 只会存在一个有效答案
 */
public class A_TwoNumSum {

    /**
     * 暴力枚举
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoNumOne(int[] nums, int target) {
        int[] ints = null;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    ints = new int[]{i, j};
                }
            }
        }
        return ints;
    }

    /**
     * 哈希表
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoNumTwo(int[] nums, int target) {
        int[] ints = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                ints[0] = i;
                ints[1] = hashMap.get(nums[i]);
                return ints;
            }
            hashMap.put(target - nums[i], i);
        }
        return ints;
    }
}
