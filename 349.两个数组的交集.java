/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-02 09:13:24 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-02 09:13:24 
 */
/*
 * @lc app=leetcode.cn id=349 lang=java
 *
 * [349] 两个数组的交集
 */

// @lc code=start
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }
        for (int num : nums2) {
            set2.add(num);
        }
        List<Integer> res = new ArrayList<>();
        for (Integer num : set1) {
            if (set2.contains(num)) {
                res.add(num);
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }
}
// @lc code=end

