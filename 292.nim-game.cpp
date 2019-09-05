/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-05 13:47:26 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-05 13:49:01
 */
class Solution
{
public:
    bool canWinNim(int n)
    {
        if (n % 4 == 0)
            return false;
        else
            return true;
    }
};
