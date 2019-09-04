/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-04 23:09:43 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2019-09-04 23:09:43 
 */
class Solution
{
public:
    int reverse(int x)
    {
        if (x == INT_MIN)
            return 0;
        long long rev;
        stringstream ss;
        ss << x;
        string str = ss.str();
        if (str[0] == '-')
        {
            string str_rev = str.substr(1);
            std::reverse(str.begin(), str.end());
            str.insert(0, "-");
        }
        else
        {
            std::reverse(str.begin(), str.end());
        }
        istringstream is(str);
        is >> rev;
        if (rev > INT_MAX || rev < INT_MIN)
            return 0;
        return rev;
    }
};
