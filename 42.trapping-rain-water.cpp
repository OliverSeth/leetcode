/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-05 13:18:52 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-05 13:20:53
 */
class Solution
{
public:
    int trap(vector<int> &height)
    {
        if (height.empty())
            return 0;
        int sum = 0;
        vector<vector<int>> memo(2, vector<int>(height.size(), 0));
        memo[0][0] = height[0];
        memo[1][height.size() - 1] = height[height.size() - 1];
        for (int i = 1; i < height.size(); i++)
            memo[0][i] = max(memo[0][i - 1], height[i]);
        for (int i = height.size() - 2; i >= 0; i--)
            memo[1][i] = max(memo[1][i + 1], height[i]);
        for (int i = 1; i < height.size() - 1; i++)
            sum += min(memo[0][i], memo[1][i]) - height[i];
        return sum;
    }
};
