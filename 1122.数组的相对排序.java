/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-14 19:42:41 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-14 19:42:41 
 */
/*
 * @lc app=leetcode.cn id=1122 lang=java
 *
 * [1122] 数组的相对排序
 */

// @lc code=start
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            map.put(arr2[i], i);
        }
        Integer[] tmp = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            tmp[i] = arr1[i];
        }
        Arrays.sort(tmp, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (map.containsKey(o1)) {
                    return map.containsKey(o2) ? map.get(o1) - map.get(o2) : -1;
                } else {
                    return map.containsKey(o2) ? 1 : o1 - o2;
                }
            }
        });
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = tmp[i];
        }
        return arr1;
    }
}
// @lc code=end

