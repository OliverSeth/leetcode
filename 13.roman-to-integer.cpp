/*
 * @Author: Oliver Seth 
 * @Date: 2019-09-04 23:27:01 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2019-09-04 23:28:04
 */
class Solution {
public:
    int romanToInt(string s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++){
            if(s[i]=='M')
                sum+=1000;
            else if(s[i]=='D')
                sum+=500;
            else if(s[i]=='C'){
                if(s[i+1]=='M'){
                    i++;
                    sum+=900;
                }
                else if(s[i+1]=='D'){
                    i++;
                    sum+=400;
                }
                else
                    sum+=100;
            }
            else if(s[i]=='L')
                sum+=50;
            else if(s[i]=='X'){
                if(s[i+1]=='C'){
                    i++;
                    sum+=90;
                }
                else if(s[i+1]=='L'){
                    i++;
                    sum+=40;
                }
                else
                    sum+=10;
            }
            else if(s[i]=='V')
                sum+=5;
            else if(s[i]=='I'){
                if(s[i+1]=='X'){
                    i++;
                    sum+=9;
                }
                else if(s[i+1]=='V'){
                    i++;
                    sum+=4;
                }
                else
                    sum+=1;
            }
        }
        return sum;
    }
};

