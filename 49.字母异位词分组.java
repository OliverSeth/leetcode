/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-18 00:00:23 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-18 00:19:49
 */
/*
 * @lc app=leetcode.cn id=49 lang=java
 *
 * [49] 字母异位词分组
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String str = Arrays.toString(temp);
            if (map.get(str) == null) {
                map.put(str, res.size());
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                res.add(list);
            } else {
                res.get(map.get(str)).add(strs[i]);
            }
        }
        return res;
    }
}
// @lc code=end
