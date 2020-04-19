/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-19 13:50:40 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-19 13:50:40 
 */
// @lc code=start
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        String lowString = String.valueOf(low);
        String highString = String.valueOf(high);
        List<Integer> res = new ArrayList<>();
        for (int len = lowString.length(); len <= highString.length(); len++) {
            for (int i = 1; i <= 10 - len; i++) {
                int j = i;
                StringBuilder sb = new StringBuilder();
                for (int cnt = 0; cnt < len; cnt++, j++) {
                    sb.append((char) (j + '0'));
                }
                String one = sb.toString();
                if ((one.length() > lowString.length() || one.compareTo(lowString) >= 0)
                        && (one.length() < highString.length() || one.compareTo(highString) <= 0)) {
                    res.add(Integer.parseInt(one));
                }
            }
        }
        return res;
    }
}
// @lc code=end
