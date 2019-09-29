/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-29 15:06:30 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-29 15:13:51
 */
class Solution
{
public:
    int lengthOfLongestSubstring(string s)
    {
        int max_len = 0;
        int left = 0;
        int right = 0;
        while (right < s.length())
        {
            int i = left;
            for (; i < right; i++)
            {
                if (s[i] == s[right])
                    break;
            }
            if (i != right)
            {
                max_len = max(max_len, right - left);
                left = i + 1;
            }
            right++;
        }
        max_len = max(max_len, right - left);
        return max_len;
    }
};
