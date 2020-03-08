/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-08 21:56:47 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-03-08 22:07:23
 */
import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String largestNumber(int[] nums) {
        if (nums.length == 0) {
            return "";
        }
        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        Comparator<String> cmp = new Comparator<String>() {
            public int compare(String a, String b) {
                String str1 = a + b;
                String str2 = b + a;
                return str2.compareTo(str1);
            }
        };
        Arrays.sort(strNums, cmp);
        StringBuilder sb = new StringBuilder();
        if (strNums[0].equals("0")) {
            return "0";
        }
        for (String str : strNums) {
            sb.append(str);
        }
        return sb.toString();
    }
}