/*
 * @Author: Oliver Seth 
 * @Date: 2020-04-03 19:54:52 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-04-03 19:54:52 
 */
/*
 * @lc app=leetcode.cn id=1333 lang=java
 *
 * [1333] 餐厅过滤器
 */

// @lc code=start
class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<int[]> list = new ArrayList<>();
        for (int[] restaurant : restaurants) {
            if (restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                if (!(veganFriendly == 1 && restaurant[2] == 0)) {
                    list.add(restaurant);
                }
            }
        }
        list.sort((o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o2[0] - o1[0];
            } else {
                return o2[1] - o1[1];
            }
        });
        List<Integer> id = new ArrayList<>();
        for (int[] ints : list) {
            id.add(ints[0]);
        }
        return id;
    }
}
// @lc code=end

