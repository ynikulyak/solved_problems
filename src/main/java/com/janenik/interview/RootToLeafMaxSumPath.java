package com.janenik.interview;

import java.util.Stack;

/**
 * Created by jane on 11/18/20.
 */
public class RootToLeafMaxSumPath {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.right = new TreeNode(100);

        System.out.print(maxSum(root));

    }

    public static int maxSum(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }

        int max = Integer.MIN_VALUE;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        Stack<Integer> sum = new Stack<>();
        sum.push(root.value);

        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            int result = sum.pop();

            if(node.left == null && node.right == null && result > max){
                max = result;
            }

            if(node.left != null){
                stack.push(node.left);
                sum.push(result+node.left.value);
            }

            if(node.right != null){
                stack.push(node.right);
                sum.push(result+node.right.value);
            }
        }
        return max;
    }
}
