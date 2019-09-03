/*
 * @Author: Oliver Seth
 * @Date: 2019-09-03 20:37:30
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-03 22:51:32
 */
class Solution {
public:
    int longestValidParentheses(string s) {
        if (s.length() == 0)
            return 0;
        int max_num = 0;
        vector<int> num(s.length(), 0);
        for (int i = 1; i < s.length(); i++) {
            if (s[i] == ')') {
                int j = i;
                if (s[i - 1] == '(')
                    num[i] = (i >= 2 ? num[i - 2] : 0) + 2;
                else if (i - num[i - 1] > 0 && s[i - num[i - 1] - 1] == '(')
                    num[i] = num[i - 1] + ((i - num[i - 1]) >= 2 ? num[i - num[i - 1] - 2] : 0) + 2;
            }
            max_num = max(max_num, num[i]);
        }
        return max_num;
    }
};