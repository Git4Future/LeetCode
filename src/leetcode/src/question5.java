/**
 * @className: question5
 * @description: 【#563 二叉树的坡度】
 * @author: Kinglone
 * @date: 2021/11/18
 **/
public class question5 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    int tilt = 0;

    public int findTilt(TreeNode root) {
        dfs(root);
        return tilt;
    }

    public int dfs(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int sumLeft = dfs(node.left);
        int sumRight = dfs(node.right);
        tilt += Math.abs(sumLeft - sumRight);
        return sumLeft + sumRight + node.val;
    }

}


