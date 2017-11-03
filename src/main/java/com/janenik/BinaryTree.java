package com.janenik;

/**
 * Created by jane on 12/11/16.
 */
public class BinaryTree {

    Node root;

    //find maximum depth of a tree - the number of nodes along the longest path from the root node down to the farthest leaf node.
    public int maxDepht(Node node){
        //if a tree is empty then return 0
        if (node == null)
            return 0;

        else {
            //compute the depth of each subtree
            int leftDepth = maxDepht(node.left);
            int rightDepth = maxDepht(node.right);

            if (leftDepth > rightDepth)
                return leftDepth+1;
            else
                return rightDepth+1;
        }
    }
}

class Node{
    int data;
    Node left, right;

    Node(int item){
        data = item;
        left = right = null;
    }
}


