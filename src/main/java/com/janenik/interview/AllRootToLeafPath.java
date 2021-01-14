package com.janenik.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jane on 11/18/20.
 */
public class AllRootToLeafPath {
    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(5);

        System.out.print(allPath(root));

    }

    public static List<List<Integer>> allPath(TreeNode root){
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        findAllPath(root, path, list);
        return list;
    }


    public static void findAllPath(TreeNode current, List<Integer> path, List<List<Integer>> allPath){
        if(current == null){
            return;
        }

        path.add(current.value);

        if(current.left == null && current.right == null){
            allPath.add(new ArrayList<Integer>(path));
        }

        if(current.left != null){
            findAllPath(current.left, path, allPath);
        }

        if(current.right != null){
            findAllPath(current.right, path, allPath);
        }

        path.remove(path.size()-1);
    }
}
