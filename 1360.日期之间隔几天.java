/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-30 22:20:25 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-30 22:20:25 
 */
/*
 * @lc app=leetcode.cn id=1360 lang=java
 *
 * [1360] 日期之间隔几天
 */

// @lc code=start
import java.text.SimpleDateFormat;
import java.util.*;
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        long time1 = 0;
        try {
            cal.setTime(sdf.parse(date1));
            time1 = cal.getTimeInMillis();
            cal.setTime(sdf.parse(date2));
        } catch (Exception ignored) {
        }
        long time2 = cal.getTimeInMillis();
        long between_days = Math.abs(time2 - time1) / (1000 * 3600 * 24);
        return Integer.parseInt(String.valueOf(between_days));
    }
}
// @lc code=end

