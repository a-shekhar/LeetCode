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
    vector<vector<int>> levelOrderBottom(TreeNode* root) {
    queue<TreeNode*>que;
	que.push(root);
	vector<vector<int>>ans;

   if(root == NULL){
    return ans;
   }

	while(que.size()>0){


		int len = que.size();
		vector<int>res;

       
		while(len--){
			TreeNode * node = que.front();
			res.push_back(node->val);
			que.pop();
			if(node->left!=NULL){
				que.push(node->left);
			}
			if(node->right!=NULL){
				que.push(node->right);
			}
		}
		ans.push_back(res);
	}


	reverse(ans.begin(),ans.end());
	return ans;

    }
};