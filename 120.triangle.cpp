/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-17 10:17:27 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-17 12:15:57
 */
class Solution
{
public:
    int minimumTotal(vector<vector<int>> &triangle)
    {
        int min_path = 0;
        bool isModify = false;
        vector<vector<int>> path;
        for (int i = 0; i < triangle.size(); i++)
        {
            vector<int> vec;
            for (int j = 0; j < triangle[i].size(); j++)
            {
                if (i == 0)
                    vec.push_back(triangle[0][0]);
                else
                {
                    if (j == 0)
                        vec.push_back(path[i - 1][j] + triangle[i][j]);
                    else if (j == triangle[i].size() - 1)
                        vec.push_back(path[i - 1][j - 1] + triangle[i][j]);
                    else if (j == triangle[i].size() - 2)
                        vec.push_back(min(path[i - 1][j - 1], path[i - 1][j]) + triangle[i][j]);
                    else
                        vec.push_back(min(path[i - 1][j - 1], path[i - 1][j]) + triangle[i][j]);
                }
            }
            path.push_back(vec);
        }
        for (int i = 0; i < path[path.size() - 1].size(); i++)
        {
            min_path = isModify == false ? path[path.size() - 1][i] : min(min_path, path[path.size() - 1][i]);
            isModify = true;
        }
        return min_path;
    }
};
