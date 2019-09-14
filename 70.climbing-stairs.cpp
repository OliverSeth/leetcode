/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 11:50:45 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 11:54:42
 */
class Solution
{
public:
    int climbStairs(int n)
    {
        vector<int> step(n + 1);
        step[n] = 1;
        step[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            step[i] = step[i + 1] + step[i + 2];
        return step[0];
    }
};
