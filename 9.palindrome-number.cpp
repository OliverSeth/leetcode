/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-05 14:18:27 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-05 14:24:38
 */
class Solution
{
public:
    bool isPalindrome(int x)
    {
        stringstream ss;
        ss << x;
        string str = ss.str();
        for (int i = 0; i <= str.length() / 2; i++)
        {
            if (str[i] != str[str.length() - i - 1])
                return false;
        }
        return true;
    }
};
