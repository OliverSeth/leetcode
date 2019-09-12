/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-08 10:29:06 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2019-09-08 10:29:06 
 */
class Solution {
public:
	vector<string> beforeAndAfterPuzzles(vector<string>& phrases) {
		vector<vector<string> > vec;
		vector<string> result;
		if(phrases.size()<2)
			return result;
		for(int i=0;i<phrases.size();i++){
			splitFirstLast(phrases[i],vec);
		}
		for(int i=0;i<phrases.size();i++){
			for(int j=0;j<phrases.size();j++){
				if(i==j)
					continue;
				if(vec[i][1]==vec[j][0]){
					string str=vec[i][0]+phrases[i]+phrases[j];
					if(find(result.begin(),result.end(),str)==result.end())
						result.push_back(str);
				}
			}
		}
		sort(result.begin(),result.end());
		return result;
	}
	void splitFirstLast(string& str,vector<vector<string> >& vec){
		string first="";
		string last="";
		int i;
		for(i=str.length()-1;i>=0;i--){
			if(str[i]==' ')
				break;
		}
		last=str.substr(i+1,str.length()-1-i);
		for(i=0;i<str.length();i++){
			if(str[i]==' ')
				break;
		}
		first=str.substr(0,i);
		if(i<str.length())
			str=str.substr(i);
		else
			str="";
		vec.push_back(vector<string>{first,last});
	}
};
