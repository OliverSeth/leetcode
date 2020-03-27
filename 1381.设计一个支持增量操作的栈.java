/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-27 23:42:20 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-27 23:42:20 
 */
/*
 * @lc app=leetcode.cn id=1381 lang=java
 *
 * [1381] 设计一个支持增量操作的栈
 */

// @lc code=start
class CustomStack {
    List<Integer> stack = new ArrayList<>();

    public CustomStack(int maxSize) {
        stack.add(maxSize);
    }

    public void push(int x) {
        if (stack.size() == stack.get(0) + 1) {
            return;
        }
        stack.add(x);
    }

    public int pop() {
        if (stack.size() == 1) {
            return -1;
        } else {
            int num = stack.get(stack.size() - 1);
            stack.remove(stack.size() - 1);
            return num;
        }
    }

    public void increment(int k, int val) {
        for (int i = 1; i < Math.min(k + 1, stack.size()); i++) {
            stack.set(i, stack.get(i) + val);
        }
    }
}
/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
// @lc code=end

