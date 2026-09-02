// Last updated: 9/1/2026, 11:40:06 PM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result = new ArrayList<>();
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                root = root.left;
            }            
            root = stack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}