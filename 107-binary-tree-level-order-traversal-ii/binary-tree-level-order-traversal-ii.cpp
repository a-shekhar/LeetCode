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
        if(root == NULL) return {};
    
    queue<pair<int, TreeNode*>> que;
    map<int, vector<int>> mp;
    
    que.push({0, root});
    mp[0].push_back(root->val);
    
    bft(root, que, mp);
    
    vector<vector<int>> ans;
    
    for(int i = mp.size()-1; i>=0; i--){
        ans.push_back(mp[i]);
    }
    return ans;
    }

    void bft(TreeNode* root, queue<pair<int, TreeNode*>>&que, map<int, vector<int>>& mp){
    while(!que.empty()){
        int level = que.front().first +1;
        if(root->left != NULL){
            que.push({level, root->left});
            mp[level].push_back(root->left->val);
        }
        if(root->right != NULL){
            que.push({level, root->right});
            mp[level].push_back(root->right->val);
        }
        
        que.pop();
        
        if(!que.empty()){
            root = que.front().second;
        }
    }
}

};