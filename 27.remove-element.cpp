/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-13 23:28:33 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-13 23:33:10
 */
class Solution
{
public:
    int removeElement(vector<int> &nums, int val)
    {
        vector<int>::iterator it = nums.begin();
        int cnt = 0;
        while (it != nums.end())
        {
            if (*it == val)
                nums.erase(it);
            else
            {
                it++;
                cnt++;
            }
        }
        return cnt;
    }
};
