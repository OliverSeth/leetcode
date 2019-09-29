/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-20 23:51:53 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-21 00:01:17
 */
class Solution
{
public:
    bool isPalindrome(string s)
    {
        string str1 = "";
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] <= 'Z' && s[i] >= 'A')
                str1 += s[i] - 'A' + 'a';
            else if ((s[i] <= 'z' && s[i] >= 'a') || (s[i] <= '9' && s[i] >= '0'))
                str1 += s[i];
        }
        string str2(str1);
        reverse(str2.begin(), str2.end());
        if (str1 == str2)
            return true;
        return false;
    }
};
