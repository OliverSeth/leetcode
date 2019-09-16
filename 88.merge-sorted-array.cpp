/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-16 22:52:42 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-16 23:30:32
 */
class Solution
{
public:
    void merge(vector<int> &nums1, int m, vector<int> &nums2, int n)
    {
        vector<int> result;
        for (int i = 0, j = 0; i < m || j < n;)
        {
            if (i == m)
                result.push_back(nums2[j++]);
            else if (j == n)
                result.push_back(nums1[i++]);
            else
            {
                if (nums1[i] < nums2[j])
                    result.push_back(nums1[i++]);
                else
                    result.push_back(nums2[j++]);
            }
        }
        for (int i = 0; i < result.size(); i++)
        {
            nums1[i] = result[i];
        }
    }
};
