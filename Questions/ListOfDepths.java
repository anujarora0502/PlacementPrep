import java.util.*;

public class ListOfDepths{
    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);

        root.left = new TreeNode(1);
        root.right = new TreeNode(2);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        Queue<TreeNode> q1 = new LinkedList<>();

        Queue<TreeNode> q2 = new LinkedList<>();

        q1.add(root);

        ArrayList<LinkedList<Integer>> result = new ArrayList<>();

        while(!q1.isEmpty()){

            LinkedList<Integer> ll = new LinkedList<>();

            while(!q1.isEmpty()){
                TreeNode removedNode = q1.remove();
                if(removedNode.left != null)
                q2.add(removedNode.left);
                if(removedNode.right != null)
                q2.add(removedNode.right);
                ll.add(removedNode.data);
            }

            result.add(ll);

            q1 = q2;

            q2 = new LinkedList<>();

        }

        System.out.println(result);
    }
}