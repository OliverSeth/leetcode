/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 11:15:47 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 11:21:35
 */
class Solution
{
public:
    vector<int> plusOne(vector<int> &digits)
    {
        if (digits[digits.size() - 1] != 9)
        {
            digits[digits.size() - 1] += 1;
            return digits;
        }
        int i;
        for (i = digits.size() - 1; i >= 0; i--)
        {
            if ((++digits[i]) != 10)
                break;
            digits[i] = 0;
        }
        if (i == -1)
            digits.insert(digits.begin(), 1);
        return digits;
    }
};
