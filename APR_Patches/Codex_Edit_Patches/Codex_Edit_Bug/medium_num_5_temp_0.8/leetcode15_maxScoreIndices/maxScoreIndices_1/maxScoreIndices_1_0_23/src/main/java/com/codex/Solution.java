package com.codex;

import java.util.*;

public class Solution {
public int sum = 0;

public int convert(String s){
	int result=0, i=0;
	while(i<s.length()){
		result = (result*10) + s[i]-'0';
		i++;
    }
	return result;
}

public void findPath(TreeNode* root, int target, vector<int> &temp){
	if(root == NULL)
		return;
	temp.push_back(root->val);
	if(root->val == target && root->left == NULL && root->right==NULL){
		//we have found the target sum
		sum++;
		return;
	}
	if(root->left != NULL)
		findPath(root->left, target-root->val, temp);
	if(root->right != NULL)
		findPath(root->right, target-root->val, temp);

	temp.pop_back();
}

int Solution::solve(TreeNode* root, int target)
{
	vector<int> temp;
	findPath(root, target, temp);
	return sum;
}
}