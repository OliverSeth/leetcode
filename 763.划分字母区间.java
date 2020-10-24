/*
 * @Author: Oliver Seth 
 * @Date: 2020-10-24 11:56:31 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-10-24 11:56:31 
 */
/*
 * @lc app=leetcode.cn id=763 lang=java
 *
 * [763] 划分字母区间
 */

// @lc code=start
class Solution {
    public List<Integer> partitionLabels(String S) {
        int[] chara = new int[26];
        for (int i = 0; i < S.length(); i++) {
            chara[S.charAt(i) - 'a'] = i;
        }
        List<Integer> list = new ArrayList<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, chara[S.charAt(i) - 'a']);
            if (i == end) {
                list.add(end - start + 1);
                start = end + 1;
            }
        }
        return list;
    }
}
// @lc code=end

