/*
 * @lc app=leetcode.cn id=1022 lang=cpp
 *
 * [1022] 从根到叶的二进制数之和
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
	int sumRootToLeaf(TreeNode* root) {
		if (!root) {
			return 0;
		}
		int n = 0;
		int* sum = &n;
		sumHelper(root, 0, sum);
		return *sum;
	}

	void sumHelper(TreeNode* root, int sum_one, int* sum) {
		sum_one = sum_one * 2 + root->val;
		if (!root->left && !root->right) {
			*sum = *sum + sum_one;
		}
		if (root->left) {
			sumHelper(root->left, sum_one, sum);
		}
		if (root->right) {
			sumHelper(root->right, sum_one, sum);
		}
	}
};
// @lc code=end

