/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 11:32:43 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 11:36:01
 */
class Solution
{
public:
    string addBinary(string a, string b)
    {
        string result = "";
        int ans = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        for (; i >= 0 || j >= 0; i--, j--)
        {
            if (i < 0)
            {
                int sum = b[j] - '0' + ans;
                result = to_string(sum % 2) + result;
                ans = sum / 2;
                continue;
            }
            if (j < 0)
            {
                int sum = a[i] - '0' + ans;
                result = to_string(sum % 2) + result;
                ans = sum / 2;
                continue;
            }
            int sum = (a[i] - '0') + (b[j] - '0') + ans;
            result = to_string(sum % 2) + result;
            ans = sum / 2;
        }
        if (ans == 1)
            result = '1' + result;
        return result;
    }
};
