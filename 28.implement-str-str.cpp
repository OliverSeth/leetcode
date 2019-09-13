/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-13 23:42:32 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-13 23:48:44
 */
class Solution
{
public:
    int strStr(string haystack, string needle)
    {
        if (needle.length() > haystack.length())
            return -1;
        if (needle == "")
            return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++)
        {
            if (haystack[i] != needle[0])
                continue;
            else
            {
                string str = haystack.substr(i, needle.length());
                if (str == needle)
                    return i;
            }
        }
        return -1;
    }
};
