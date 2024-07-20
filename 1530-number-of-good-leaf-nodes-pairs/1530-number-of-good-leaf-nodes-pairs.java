/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int res=0;
    public int[] dfs(TreeNode root, int distance){
        int leafDis[]= new int [11];
        if(root==null)
        return leafDis;
        else if(root.left==null && root.right==null){
            leafDis[1]=1;
            return leafDis;
        }
        int leftDis[]= dfs(root.left, distance);
        int rightDis[]= dfs(root.right, distance);

        for(int d1=1;d1<11;d1++){
            for(int d2=1;d2<11;d2++){
                if(d1+d2<=distance)
                res+=leftDis[d1]*rightDis[d2];
            }
        }

        for(int d=1; d<11;d++){
            leafDis[d]=leftDis[d-1]+rightDis[d-1];
        }

        return leafDis;

    }
    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);

        return res;
        
    }
}