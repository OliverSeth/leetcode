/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-22 23:42:23 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-02-22 23:42:23 
 */
class Solution {
    public:
        int distanceBetweenBusStops(vector<int>& distance, int start, int destination) {
            int sum1=0;
            int sum2=0;
            if(start==destination)
                return 0;
            if(start>destination)
                swap(start,destination);
            for(int i=0;i<start;i++)
                sum1+=distance[i];
            for(int i=destination;i<distance.size();i++)
                sum1+=distance[i];
            for(int i=start;i<destination;i++)
                sum2+=distance[i];
            return min(sum1,sum2);
        }
    };