/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-22 23:43:56 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-02-22 23:43:56 
 */
class Solution {
    public:
        string dayOfTheWeek(int day, int month, int year) {
            int days=countDays(day,month,year);
            vector<string> cor{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday","Sunday"};
            return cor[(days%7+8)%7];
        }
        int countDays(int day, int month, int year){
            int days=0;
            int months[]={31,28,31,30,31,30,31,31,30,31,30,31};
            if(year>2019||(year==2019&&month>1)||(year==2019&&month==1&&day>1)){
                for(int i=2019;i<year;i++){
                    if(isLeap(i))
                        days+=366;
                    else
                        days+=365;
                }
                for(int i=0;i<month-1;i++){
                    if(i==1&&isLeap(year)){
                        days+=29;
                        continue;
                    }
                    else
                        days+=months[i];
                }
                days+=day-1;
            }
            else{
                days=-1;
                for(int i=2018;i>year;i--){
                    if(isLeap(i))
                        days-=366;
                    else
                        days-=365;
                }
                for(int i=11;i>=month;i--){
                    if(i==1&&isLeap(year)){
                        days-=29;
                        continue;
                    }
                    else
                        days-=months[i];
                }
                if(isLeap(year)&&month==2)
                    days-=29-day;
                else
                    days-=months[month-1]-day;
            }
            return days;
        }
        bool isLeap(int year){
            if(year%400==0)
                return true;
            if(year%4==0&&year%100!=0)
                return true;
            return false;
        }
    };