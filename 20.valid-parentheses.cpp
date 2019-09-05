/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-05 11:19:40 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-05 11:24:58
 */
class Solution
{
public:
    bool isValid(string s)
    {
        stack<char> sta;
        for (int i = 0; i < s.length(); i++)
        {
            if (s[i] == '(' || s[i] == '[' || s[i] == '{')
                sta.push(s[i]);
            if (s[i] == ')')
            {
                if (sta.empty())
                    return false;
                if (sta.top() == '(')
                    sta.pop();
                else
                    return false;
            }
            if (s[i] == ']')
            {
                if (sta.empty())
                    return false;
                if (sta.top() == '[')
                    sta.pop();
                else
                    return false;
            }
            if (s[i] == '}')
            {
                if (sta.empty())
                    return false;
                if (sta.top() == '{')
                    sta.pop();
                else
                    return false;
            }
        }
        if (sta.empty())
            return true;
        else
            return false;
    }
};
