/*
 * @Author: Oliver Seth 
 * @Date: 2020-02-10 23:19:54 
 * @Last Modified by: Oliver Seth
 * @Last Modified time: 2020-02-10 23:24:16
 */
class Solution {
    private int right=-1;
    private int left;
    public int[] searchRange(int[] nums, int target) {
        left=nums.length;
        helper(nums,target,0,nums.length-1);
        if(right==-1){
            return new int[]{-1,-1};
        }else{
            return new int[]{left,right};
        }
    }
    private void helper(int[] nums,int target,int start,int end){
        if(start>end){
            return;
        }
        int middle=(start+end)/2;
        if(nums[middle]==target){
            if(middle<left){
                left=middle;
            }
            if(middle>right){
                right=middle;
            }
            helper(nums,target,middle+1,end);
            helper(nums,target,start,middle-1);
        }else if(nums[middle]<target){
            helper(nums,target,middle+1,end);
        }else{
            helper(nums,target,start,middle-1);
        }
    }
}

