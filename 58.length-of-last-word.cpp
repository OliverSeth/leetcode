/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 00:16:39 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 00:24:09
 */
class Solution
{
public:
    int lengthOfLastWord(string s)
    {
        int i;
        int len = s.length();
        bool flag = false;
        for (i = s.length() - 1; i >= 0; i--)
        {
            if (s[i] != ' ')
                flag = true;
            if (s[i] == ' ')
            {
                if (flag)
                    break;
                else
                    len--;
            }
        }
        if (!flag)
            return 0;
        return len - i - 1;
    }
};
