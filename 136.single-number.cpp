/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-29 11:01:09 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-29 11:11:52
 */
class Solution
{
public:
    int singleNumber(vector<int> &nums)
    {
        vector<int> single;
        for (int i = 0; i < nums.size(); i++)
        {
            vector<int>::iterator it = single.begin();
            bool isSingle = true;
            for (; it != single.end(); it++)
            {
                if (*it == nums[i])
                {
                    isSingle = false;
                    single.erase(it);
                    break;
                }
            }
            if (isSingle)
                single.push_back(nums[i]);
        }
        return single[0];
    }
};
