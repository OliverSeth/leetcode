/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-08 10:27:33 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-08 10:28:08
 */
class Solution {
public:
	int countLetters(string S) {
		int sum=S.length();
		int left=0;
		int i=1;
		for(;i<S.length();i++){
			if(S[i]!=S[i-1]){
				if(i!=left){
					sum+=(i-left)*(i-left-1)/2;
					left=i;
				}
			}
		}
		if(left!=i){
			sum+=(i-left)*(i-left-1)/2;
		}
		return sum;
	}
};

