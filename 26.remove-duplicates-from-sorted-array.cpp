/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-13 22:23:16 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-13 22:44:00
 */
class Solution
{
public:
    int removeDuplicates(vector<int> &nums)
    {
        if (nums.size() == 0)
            return 0;
        int cnt = 1;
        int num = nums[0];
        vector<int>::iterator it = nums.begin();
        it++;
        for (; it != nums.end();)
        {
            if (num == *(it))
                nums.erase(it);
            else
            {
                num = *(it);
                it++;
                cnt++;
            }
        }
        return cnt;
    }
};
