/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-14 19:01:45 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-14 19:33:34
 */
class Solution
{
public:
    int uniquePathsWithObstacles(vector<vector<int>> &obstacleGrid)
    {
        vector<vector<long long>> path(obstacleGrid.size(), vector<long long>(obstacleGrid[0].size()));
        bool flag = false;
        for (int i = 0; i < path.size(); i++)
        {
            if (flag)
                path[i][0] = 0;
            else if (obstacleGrid[i][0] == 1)
            {
                flag = true;
                path[i][0] = 0;
            }
            else
                path[i][0] = 1;
        }
        flag = false;
        for (int i = 0; i < path[0].size(); i++)
        {
            if (flag)
                path[0][i] = 0;
            else if (obstacleGrid[0][i] == 1)
            {
                flag = true;
                path[0][i] = 0;
            }
            else
                path[0][i] = 1;
        }
        for (int i = 1; i < path.size(); i++)
        {
            for (int j = 1; j < path[0].size(); j++)
            {
                if (obstacleGrid[i][j] == 1)
                    path[i][j] = 0;
                else
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
            }
        }
        return path[path.size() - 1][path[0].size() - 1];
    }
};
