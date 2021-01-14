/*
 * @Author: Oliver Seth 
 * @Date: 2021-01-13 14:08:50 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2021-01-13 14:08:50 
 */
/*
 * @lc app=leetcode.cn id=684 lang=java
 *
 * [684] 冗余连接
 */

// @lc code=start
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[edges.length];
        int[] res = new int[2];
        for (int i = 0; i < parent.length; i++) {
            parent[i] = i;
        }
        for (int i = 0; i < edges.length; i++) {
            if (find(parent, edges[i][0] - 1) == find(parent, edges[i][1] - 1)) {
                res[0] = Math.min(edges[i][0], edges[i][1]);
                res[1] = edges[i][0] + edges[i][1] - res[0];
                return res;
            } else {
                union(parent, edges[i][0] - 1, edges[i][1] - 1);
            }
        }
        return res;
    }

    private int find(int[] parent, int index) {
        if (parent[index] != index) {
            parent[index] = find(parent, parent[index]);
        }
        return parent[index];
    }

    private void union(int[] parent, int index1, int index2) {
        parent[find(parent, index1)] = find(parent, index2);
    }
}
// @lc code=end

