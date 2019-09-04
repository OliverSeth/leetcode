/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-04 21:57:29 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2019-09-04 21:57:29 
 */

class Solution
{
public:
    int maxSubArray(vector<int> &nums)
    {
        int max_num = INT_MIN;
        vector<int> sum(nums.size(), 0);
        for (int i = 0; i < nums.size(); i++)
        {
            sum[i] = nums[i];
            max_num = max(max_num, sum[i]);
            for (int j = i + 1; j < nums.size(); j++)
            {
                sum[j] = sum[j - 1] + nums[j];
                max_num = max(max_num, sum[j]);
            }
        }
        return max_num;
    }
};
