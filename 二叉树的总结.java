//这是对于二叉树结构的一些基本总结，使用Java语言描述

//二叉树的结构
class TreeNode(){
    int val;
    //左子树
    TreeNode left;
    //右子树
    TreeNode right;
}

//二叉树的题目可以普遍使用递归和迭代的方法来解

//求二叉树的最大深度
/*
二叉树的最大深度就是根节点到最远子节点的距离
对于任意一个节点，它的深度就是它左右两个子节点的深度+1
 */
class Solution {//解法：该方法使用递归的方法
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
    return Math.max(maxDepth(root.left), maxDepth(root.right))+1;        
    }
}

