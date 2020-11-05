/*
 * @Author: Oliver Seth 
 * @Date: 2020-11-05 09:50:45 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-11-05 09:50:45 
 */
/*
 * @lc app=leetcode.cn id=310 lang=java
 *
 * [310] 最小高度树
 */

// @lc code=start
class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> res = new ArrayList<>();
        if (n == 1) {
            res.add(0);
            return res;
        }
        int[] degree = new int[n];
        List<List<Integer>> neighbor = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            neighbor.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            degree[edge[0]]++;
            degree[edge[1]]++;
            neighbor.get(edge[0]).add(edge[1]);
            neighbor.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                queue.offer(i);
            }
        }
        while (!queue.isEmpty()) {
            res = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int tmp = queue.poll();
                res.add(tmp);
                for (int j = 0; j < neighbor.get(tmp).size(); j++) {
                    int one = neighbor.get(tmp).get(j);
                    degree[one]--;
                    if (degree[one] == 1) {
                        queue.offer(one);
                    }
                }
            }
        }
        return res;
    }
}
// @lc code=end

