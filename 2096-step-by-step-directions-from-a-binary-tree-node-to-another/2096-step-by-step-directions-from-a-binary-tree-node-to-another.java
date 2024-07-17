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
    public TreeNode LCA(TreeNode root, int p, int q){
        if(root== null || root.val==p || root.val==q)
        return root;

        TreeNode left= LCA(root.left, p,q);
        TreeNode right= LCA(root.right,p,q);
        if(left== null)
        return right;
        else if(right == null)
        return left;
        else
        return root;
    }
    public boolean isPath(TreeNode root, int target, StringBuilder path){
        if(root==null)
        return false;
        if(root.val==target)
        return true;

        path.append("L");
        if(isPath(root.left,target,path)){
            return true;
        }
        path.setLength(path.length()-1);

         path.append("R");
        if(isPath(root.right,target,path)){
            return true;
        }
        path.setLength(path.length()-1);

        return false;
        
    }
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode lca= LCA(root, startValue, destValue);
        StringBuilder startToLCA= new StringBuilder();
        StringBuilder LCAtoEnd= new StringBuilder();
        isPath(lca, startValue, startToLCA);
        isPath(lca,destValue, LCAtoEnd);
        StringBuilder res= new StringBuilder();
        for(int i=0; i<startToLCA.length();i++){
            res.append("U");
        }
        res.append(LCAtoEnd);

        return res.toString();
        
    }
}