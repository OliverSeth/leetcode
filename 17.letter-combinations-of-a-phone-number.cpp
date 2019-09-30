/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-30 08:41:45 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-30 14:28:26
 */
// @lc code=start
#include <vector>
class Solution
{
public:
    vector<string> letterCombinations(string digits)
    {
        if (digits == "")
            return vector<string>();
        vector<string> str({"", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"});
        vector<int> cnt(digits.length(), 0);
        vector<string> result;
        string s = "";
        while (true)
        {
            for (int i = 0; i < digits.length(); i++)
                s += str[digits[i] - '1'][cnt[i]];
            result.push_back(s);
            s.clear();
            int n = cnt.size() - 1;
            if (cnt[n] + 1 == str[digits[n] - '1'].size())
            {
                while (cnt[n] + 1 == str[digits[n] - '1'].size())
                {
                    if (n == 0)
                        return result;
                    cnt[n] = 0;
                    n--;
                }
                cnt[n]++;
            }
            else
                cnt[n]++;
        }
    }
};
// @lc code=end
