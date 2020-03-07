/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-07 22:12:39 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-07 22:12:39 
 */
/*
 * @lc app=leetcode.cn id=1356 lang=java
 *
 * [1356] 根据数字二进制下 1 的数目排序
 */

// @lc code=start
class Solution {
    public int[] sortByBits(int[] arr) {
        int[] number=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            while(num!=0){
                while(num%2==0){
                    num/=2;
                }
                if(num%2==1){
                    number[i]++;
                    num/=2;
                }
            }
        }
        for(int i=0;i<arr.length-1;i++){
            int k=i;
            for(int j=i+1;j<arr.length;j++){
                if(number[k]>number[j]||(number[k]==number[j]&&arr[k]>arr[j])){
                    k=j;
                }
            }
            if(k!=i){
                int temp=arr[i];
                arr[i]=arr[k];
                arr[k]=temp;
                temp=number[i];
                number[i]=number[k];
                number[k]=temp;
            }
        }
        return arr;
    }
}
// @lc code=end

