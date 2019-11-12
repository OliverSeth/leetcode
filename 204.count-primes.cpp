/*
 * @Author: Oliver Seth 
 * @Date: 2019-11-12 17:20:20 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-11-12 17:27:18
 */
// @lc code=start
class Solution
{
public:
    int countPrimes(int n)
    {
        int cnt = 0;
        for (int i = 2; i < n; i++)
        {
            if (isPrime(i))
                cnt++;
        }
        return cnt;
    }
    bool isPrime(int n)
    {
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }
};
// @lc code=end
