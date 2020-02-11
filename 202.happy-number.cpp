/*
 * @Author: Oliver Seth 
 * @Date: 2019-10-11 17:00:06 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-10-11 17:03:11
 */
// @lc code=start
class Solution
{
public:
    bool isHappy(int n)
    {
        vector<int> vec;
        while (n != 1)
        {
            for (int i = 0; i < vec.size(); i++)
            {
                if (vec[i] == n)
                    return false;
            }
            vec.push_back(n);
            stringstream ss;
            ss << n;
            string s = ss.str();
            n = 0;
            for (int i = 0; i < s.length(); i++)
                n += (s[i] - '0') * (s[i] - '0');
        }
        return true;
    }
};
// @lc code=end
