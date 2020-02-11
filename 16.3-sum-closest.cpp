/*
 * @Author: Oliver Seth 
 * @Date: 2019-10-08 14:11:57 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-10-18 15:54:11
 */
// @lc code=start
class Solution
{
public:
    int threeSumClosest(vector<int> &nums, int target)
    {
        if (nums.size() < 3)
            return 0;
        sort(nums.begin(), nums.end());
        int near = nums[0] + nums[1] + nums[2];
        int len = abs(target - near);
        for (int i = 0; i <= nums.size() - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = nums.size() - 1;
            while (left < right)
            {
                int temp = nums[i] + nums[left] + nums[right];
                if (temp == target)
                {
                    near = target;
                    len = 0;
                    break;
                }
                if (len > abs(target - temp))
                {
                    near = temp;
                    len = abs(target - near);
                }
                if (temp < target)
                    left++;
                if (temp > target)
                    right--;
            }
            if (len == 0)
                break;
        }
        return near;
    }
};
// @lc code=end
