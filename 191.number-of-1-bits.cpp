/*
 * @Author: Oliver Seth 
 * @Date: 2019-10-18 15:15:45 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-10-18 15:21:46
 */
// @lc code=start
class Solution
{
public:
    int hammingWeight(uint32_t n)
    {
        int cnt = 0;
        while (n != 0)
        {
            if (n % 2 == 1)
                cnt++;
            n /= 2;
        }
        return cnt;
    }
};
// @lc code=end
