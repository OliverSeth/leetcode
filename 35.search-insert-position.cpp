/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-13 23:51:10 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-13 23:52:11
 */
class Solution
{
public:
    int searchInsert(vector<int> &nums, int target)
    {
        for (int i = 0; i < nums.size(); i++)
        {
            if (nums[i] >= target)
                return i;
        }
        return nums.size();
    }
};
