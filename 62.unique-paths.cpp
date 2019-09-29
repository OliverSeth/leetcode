/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 18:48:26 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 18:54:57
 */
class Solution
{
public:
    int uniquePaths(int m, int n)
    {
        vector<vector<int>> path(m, vector<int>(n));
        for (int i = 0; i < m; i++)
            path[i][0] = 1;
        for (int i = 0; i < n; i++)
            path[0][i] = 1;
        for (int i = 1; i < m; i++)
            for (int j = 1; j < n; j++)
                path[i][j] = path[i - 1][j] + path[i][j - 1];
        return path[m-1][n-1];
    }
};
