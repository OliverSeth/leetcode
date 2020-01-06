/*
 * @Author: Oliver Seth 
 * @Date: 2020-01-06 15:16:38 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-01-06 15:59:17
 */
// @lc code=start
class Solution
{
public:
    int numDecodings(string s)
    {
        vector<int> ans(s.length() + 1);
        if (s.length() <= 0)
            return 0;
        else if (s.length() == 1)
        {
            if (s[0] >= '1' && s[0] <= '9')
                return 1;
            else
                return 0;
        }
        else
        {
            if (s[0] == '0')
                return 0;
            ans[0] = 1;
            ans[1] = 1;
            for (int i = 2; i < ans.size(); i++)
            {
                if (s[i - 1] == '0' && (s[i - 2] != '1' && s[i - 2] != '2'))
                    return 0;
                if (s[i - 2] == '1' || (s[i - 2] == '2' && s[i - 1] <= '6'))
                {
                    if (s[i - 1] != '0')
                        ans[i] = ans[i - 2] + ans[i - 1];
                    else
                        ans[i] = ans[i - 2];
                }
                else
                    ans[i] = ans[i - 1];
            }
        }
        return ans[s.length()];
    }
};
// @lc code=end
