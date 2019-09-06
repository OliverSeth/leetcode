/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-06 10:38:23 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-06 10:54:38
 */
class Solution
{
public:
    string convert(string s, int numRows)
    {
        if (numRows == 1)
            return s;
        string zigzag = "";
        for (int j = 0; j < numRows; j++)
        {
            if (j == 0)
            {
                for (int i = 0; i < s.length(); i += 2 * numRows - 2)
                    zigzag += s[i];
            }
            else if (j == numRows - 1)
            {
                for (int i = numRows - 1; i < s.length(); i += 2 * numRows - 2)
                {
                    zigzag += s[i];
                }
            }
            else
            {
                for (int i = j; i < s.length(); i += 2 * numRows - 2)
                {
                    zigzag += s[i];
                    if (i - 2 * j + 2 * numRows - 2 < s.length())
                        zigzag += s[i - 2 * j + 2 * numRows - 2];
                }
            }
        }
        return zigzag;
    }
};
