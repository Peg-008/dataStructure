package sort.April22th.ergodic;

/**
 * @author Anthony on 2019/4/22
 */
public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;

    public TreeNode() {
    }

    public TreeNode(int data, TreeNode left, TreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public void print(int data) {
        System.out.print(data+ " ");
    }
}
