/*
 * @Author: Oliver Seth 
 * @Date: 2020-12-28 15:23:45 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-12-28 15:23:45 
 */
/*
 * @lc app=leetcode.cn id=1345 lang=java
 *
 * [1345] 跳跃游戏 IV
 */

// @lc code=start
class Solution {
    Map<Integer, List<Integer>> map;

    public int minJumps(int[] arr) {
        map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.get(arr[i]).add(i);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
            }
        }
        boolean[] visit = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(arr.length - 1);
        visit[arr.length - 1] = true;
        int[] jump = new int[arr.length];
        Arrays.fill(jump, Integer.MAX_VALUE);
        jump[arr.length - 1] = 0;
        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            if (tmp - 1 >= 0 && !visit[tmp - 1] && map.containsKey(arr[tmp-1])) {
                visit[tmp - 1] = true;
                jump[tmp - 1] = Math.min(jump[tmp - 1], jump[tmp] + 1);
                queue.offer(tmp - 1);
            }
            if (tmp + 1 < arr.length && !visit[tmp + 1] && map.containsKey(arr[tmp+1])) {
                visit[tmp + 1] = true;
                jump[tmp + 1] = Math.min(jump[tmp + 1], jump[tmp] + 1);
                queue.offer(tmp + 1);
            }
            if (map.containsKey(arr[tmp])) {
                List<Integer> list = map.get(arr[tmp]);
                for (int i = 0; i < list.size(); i++) {
                    if (!visit[list.get(i)]) {
                        visit[list.get(i)] = true;
                        jump[list.get(i)] = Math.min(jump[list.get(i)], jump[tmp] + 1);
                        queue.offer(list.get(i));
                    }
                }
                map.remove(arr[tmp]);
            }
        }
        return jump[0];
    }
}
// @lc code=end

