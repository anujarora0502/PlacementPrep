import java.util.*;

public class CheckBalanced {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);

        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        root.right.left.left = new TreeNode(7);

        root.right.left.left.left = new TreeNode(8);

        System.out.println(CheckBalanced(root).isTreeBalanced);
    }

    public static pair CheckBalanced(TreeNode node) {

        if (node == null) {
            return new pair(true, 0);
        }

        pair leftSubtreeResult = CheckBalanced(node.left);
        pair rightSubtreeResult = CheckBalanced(node.right);

        if (leftSubtreeResult.isTreeBalanced == false || rightSubtreeResult.isTreeBalanced == false) {
            return new pair(false, -1);
        }

        if (leftSubtreeResult.height - rightSubtreeResult.height > 1
                || leftSubtreeResult.height - rightSubtreeResult.height < -1) {
            return new pair(false, -1);
        }

        return new pair(true, Math.max(leftSubtreeResult.height, rightSubtreeResult.height) + 1);

    }

    public static class pair {
        boolean isTreeBalanced;
        int height;

        pair(boolean isTreeBalanced, int height) {
            this.isTreeBalanced = isTreeBalanced;
            this.height = height;
        }
    }
}