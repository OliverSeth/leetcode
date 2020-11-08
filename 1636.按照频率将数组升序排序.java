/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-04 10:09:19 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-04 10:09:19 
 */
/*
 * @lc app=leetcode.cn id=1636 lang=java
 *
 * [1636] 按照频率将数组升序排序
 */

// @lc code=start
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        List<List<Integer>> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            List<Integer> one = new ArrayList<>();
            one.add(entry.getKey());
            one.add(entry.getValue());
            list.add(one);
        }
        Collections.sort(list, new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> o1, List<Integer> o2) {
                if (o1.get(1) < o2.get(1)) {
                    return -1;
                } else if (o1.get(1) == o2.get(1)) {
                    if (o1.get(0) > o2.get(0)) {
                        return -1;
                    } else {
                        return 1;
                    }
                } else {
                    return 1;
                }
            }
        });
        int pos = 0;
        int cnt = 1;
        for (int i = 0; i < nums.length; i++) {
            if (cnt > list.get(pos).get(1)) {
                pos++;
                cnt = 1;
            }
            nums[i] = list.get(pos).get(0);
            cnt++;
        }
        return nums;
    }
}
// @lc code=end

