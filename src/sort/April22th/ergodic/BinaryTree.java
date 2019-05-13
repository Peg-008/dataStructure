package sort.April22th.ergodic;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Anthony on 2019/4/22
 */
public class BinaryTree {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    public static void preOrder(TreeNode root){
        if (root!=null){
            root.print(root.getData());
            preOrder(root.getLeft());
            preOrder(root.getRight());
        }
    }
    public static void inOrder(TreeNode root){
        if (root!=null){
            inOrder(root.getLeft());
            root.print(root.getData());
            inOrder(root.getRight());
        }
    }
    public static void postOrder(TreeNode root){
        if (root!=null){
            postOrder(root.getLeft());
            postOrder(root.getRight());
            root.print(root.getData());
        }
    }

    public static void iteratePreOrder(TreeNode root){
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode node = root;
        while (node!=null ||stack.size()>0){
            while (node!=null){
                node.print(node.getData());
                stack.push(node);
                node = node.getLeft();
            }
            if (stack.size()>0){
                node = stack.pop();
                node = node.getRight();
            }
        }
    }

    public static void iterateInOrder(TreeNode root){
        Stack<TreeNode>stack = new Stack<>();
        TreeNode node =root;
        while (node !=null || stack.size()>0){
            while (node!=null){
                stack.push(node);
                node = node.getLeft();
            }
            if (stack.size()>0){
                node = stack.pop();
                node.print(node.getData());
                node = node.getRight();
            }
        }
    }

    public static void iteratePostOrder(TreeNode root){
        Stack<TreeNode> stack =new Stack<>();
        Stack<TreeNode> temp = new Stack<>();
        TreeNode node =root;
        while (node!=null ||stack.size()>0){
            while (node!=null){
                stack.push(node);
                temp.push(node);
                node = node.getRight();
            }
            if (stack.size()>0){
                node =stack.pop();
                node = node.getLeft();
            }
            if (temp.size()>0){
                node = temp.pop();
                node.print(node.getData());
            }
        }
    }
    public static void layerOrder(TreeNode root){
        Queue<TreeNode> queue = new ArrayDeque<>();
        TreeNode node =root;
        if (node!=null){
            queue.offer(node);
        }
        while (!queue.isEmpty()){
            node = queue.poll();
            node.print(node.getData());
            if (node.getLeft()!=null){
                queue.offer(node.getLeft());
            }
            if (node.getRight()!=null){
                queue.offer(node.getRight());
            }
        }
    }
}
