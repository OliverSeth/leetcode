/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 10:59:45 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 11:24:34
 */
class Solution
{
public:
    int maxArea(vector<int> &height)
    {
        int max_num = 0;
        int left = 0;
        int right = height.size() - 1;
        while (left != right)
        {
            max_num = max(max_num, (right - left) * min(height[left], height[right]));
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max_num;
    }
};
