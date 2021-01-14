package com.janenik.interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by jane on 11/12/20.
 */
public class BSTLeftView {
    public static void main(String[] args){
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.left.left = new TreeNode(3);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        List<TreeNode> list = leftView(root);
        for(TreeNode node : list){
            System.out.print(node.value + " ");
        }

    }

    public static List<TreeNode> leftView(TreeNode root){
        List<TreeNode> list = new ArrayList<>();
        if(root == null){
            return list;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            int nodes = levelSize;

            while(levelSize > 0){
                TreeNode node = queue.poll();
                if(levelSize == nodes){
                   list.add(node);
                }
                if(node.left != null){
                    queue.offer(node.left);
                }
                if(node.right != null){
                    queue.offer(node.right);
                }
                levelSize--;
            }
        }

        return list;
    }
}
