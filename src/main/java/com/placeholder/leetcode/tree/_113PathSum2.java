package com.placeholder.leetcode.tree;

import com.placeholder.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 阙宇翔
 * @version 2016/2/23
 */
public class _113PathSum2 {
    void pathSum(List<List<Integer>> paths, List<Integer> path, TreeNode root, int sum) {
        if (root == null)
            return;
        // leaf node
        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                path.add(root.val);
                paths.add(path);
                path.remove(path.size() - 1);
            }
        }
        if (root.left != null) {
            path.add(root.val);
            pathSum(paths, path, root.left, sum - root.val);
            path.remove(path.size() - 1);
        }
        if (root.right != null) {
            path.add(root.val);
            pathSum(paths, path, root.right, sum - root.val);
            path.remove(path.size() - 1);
        }
    }

    List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> paths = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        pathSum(paths, path, root, sum);
        return paths;
    }
}
