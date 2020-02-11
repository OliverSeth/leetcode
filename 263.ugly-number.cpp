/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-30 14:49:54 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-30 14:54:45
 */
// @lc code=start
class Solution
{
public:
    bool isUgly(int num)
    {
        if (num == 0)
            return false;
        while (num % 2 == 0)
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0)
            num /= 5;
        return num == 1;
    }
};
// @lc code=end
