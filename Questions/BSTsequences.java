import java.util.*;

public class BSTsequences {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(3);

        root.left = new TreeNode(1);
        root.right = new TreeNode(5);

        root.left.right = new TreeNode(2);

        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(6);

        List<List<Integer>> result = allSequence(root);

        System.out.println(result);

        System.out.println(result.size());

    }

    public static List<List<Integer>> allSequence(TreeNode node) {
        List<List<Integer>> result = new ArrayList<>();

        if (node == null) {
            result.add(new LinkedList<Integer>());

            return result;
        }

        List<Integer> prefix = new LinkedList<>();

        prefix.add(node.data);

        List<List<Integer>> leftSeq = allSequence(node.left);
        List<List<Integer>> rightSeq = allSequence(node.right);

        for (List<Integer> left : leftSeq) {
            for (List<Integer> right : rightSeq) {
                List<List<Integer>> merged = new ArrayList<>();
                merge(left, right, merged, prefix);
                result.addAll(merged);
            }
        }

        return result;
    }

    public static void merge(List<Integer> left, List<Integer> right, List<List<Integer>> merged,
            List<Integer> prefix) {

        
            if(left.size() == 0 || right.size() == 0){

                 prefix.addAll(left);
                 prefix.addAll(right);

                 merged.add(prefix);

                 return;


            }

            List<Integer> alteredLeft = new LinkedList<>();
            List<Integer> alteredRight = new LinkedList<>();

            alteredLeft.addAll(left);
            alteredRight.addAll(right);

            alteredLeft.remove(0);
            alteredRight.remove(0);

            List<Integer> prefixLeft = new LinkedList<>();
            List<Integer> prefixRight = new LinkedList<>();

            prefixLeft.addAll(prefix);
            prefixRight.addAll(prefix);

            prefixLeft.add(left.get(0));
            prefixRight.add(right.get(0));

            merge(alteredLeft, right, merged, prefixLeft);
            merge(left, alteredRight, merged, prefixRight);

        

    }
}