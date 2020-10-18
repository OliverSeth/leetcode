/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-18 09:42:20 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-18 09:42:20 
 */
/*
 * @lc app=leetcode.cn id=187 lang=java
 *
 * [187] 重复的DNA序列
 */

// @lc code=start
class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> res = new HashSet<>();
        Set<String> exist = new HashSet<>();
        for (int i = 0; i <= s.length() - 10; i++) {
            String tmp = s.substring(i, i + 10);
            if (exist.contains(tmp)) {
                if (!res.contains(tmp)) {
                    res.add(tmp);
                }
            } else {
                exist.add(tmp);
            }
        }
        return new ArrayList<>(res);
    }
}
// @lc code=end

