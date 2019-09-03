/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-03 15:00:36 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-03 15:01:09
 */
class Solution {
public:
	bool isMatch(string s, string p) {
		return regex_match(s, regex(p));
	}
};