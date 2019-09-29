/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 19:38:41 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 20:01:21
 */
class Solution
{
public:
    int minPathSum(vector<vector<int>> &grid)
    {
        for (int i = 0; i < grid.size(); i++)
        {
            for (int j = 0; j < grid[0].size(); j++)
            {
                if (i == 0 && j == 0)
                    continue;
                if (i == 0)
                    grid[0][j] += grid[0][j - 1];
                else if (j == 0)
                    grid[i][0] += grid[i - 1][0];
                else
                    grid[i][j] += min(grid[i - 1][j], grid[i][j - 1]);
            }
        }
        return grid[grid.size() - 1][grid[0].size() - 1];
    }
};
