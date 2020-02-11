/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-11 15:53:01 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-11 16:06:44
 */
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        helper(res, "", 0, 0, n);
        return res;
    }

    private void helper(List<String> res, String par, int left, int right, int max) {
        if (par.length() == max * 2) {
            res.add(par);
            return;
        }
        if (left < max) {
            helper(res, par + "(", left + 1, right, max);
        }
        if (right < left) {
            helper(res, par + ")", left, right + 1, max);
        }
    }
}