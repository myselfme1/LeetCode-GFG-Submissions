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
class Solution 
{
    List<Integer> l = new ArrayList<Integer>();
    public List<Integer> rightSideView(TreeNode root)
    {
        //List<Integer> al = new ArrayList<Integer>();
       // TreeNode head=root;
        traverse(root,0);
       /* while(root!=null)
        {
           
            root=root.right;
        }*/
        return l;
    }
    void traverse(TreeNode head,int level)
        {
            if(head==null)
                return;
            if(level==l.size())
                l.add(head.val);
            traverse(head.right,level+1);
            traverse(head.left,level+1);
        }
}