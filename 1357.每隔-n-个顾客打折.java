/*
 * @Author: Oliver Seth 
 * @Date: 2020-03-07 22:16:08 
 * @Last Modified by:   Oliver Seth 
 * @Last Modified time: 2020-03-07 22:16:08 
 */
/*
 * @lc app=leetcode.cn id=1357 lang=java
 *
 * [1357] 每隔 n 个顾客打折
 */

// @lc code=start
class Cashier {
    private int n;
    private int discount;
    private int[] product;
    private int[] prices;
    private int number;

    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n = n;
        number = 0;
        this.discount = discount;
        this.product = products;
        this.prices = prices;
    }

    public double getBill(int[] product, int[] amount) {
        number++;
        double cost = 0;
        for (int i = 0; i < product.length; i++) {
            for (int j = 0; j < this.product.length; j++) {
                if (this.product[j] == product[i]) {
                    cost += this.prices[j] * amount[i];
                }
            }
        }
        if (number == n) {
            number = 0;
            cost = cost - (discount * cost) / 100;
        }
        return cost;
    }
}


/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */
// @lc code=end

