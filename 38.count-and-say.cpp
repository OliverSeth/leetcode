/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 00:10:54 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 00:15:09
 */
class Solution
{
public:
    string countAndSay(int n)
    {
        if (n == 1)
            return "1";
        string str = countAndSay(n - 1);
        string str2 = "";
        int cnt = 1;
        for (int i = 0; i < str.length(); i++)
        {
            if (i != str.length() - 1 && str[i] == str[i + 1])
            {
                cnt++;
                continue;
            }
            str2 += to_string(cnt);
            str2 += str[i];
            cnt = 1;
        }
        return str2;
    }
};
