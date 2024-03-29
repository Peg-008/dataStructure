package tree;


import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Anthony on 2019/5/6
 */
public class BinarySearchTree<E extends Comparable<E>> {
    private class Node{
        public E e;
        public Node left,right;

        public Node(E e){
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BinarySearchTree(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向二分搜索树中添加新的元素e
     * @param e
     */
    public void add(E e){
        root = add(root,e);
        //if (root == null){
        //    root = new Node(e);
        //    size ++;
        //}else {
        //    add(root,e);
        //}
    }


    //private void add(Node node,E e){
    //    if (e.equals(node.e)){
    //        return;
    //    }else if (e.compareTo(node.e) < 0 && node.left == null){
    //        node.left = new Node(e);
    //        size ++;
    //        return;
    //    } else if (e.compareTo(node.e) > 0 && node.right == null){
    //        node.right = new Node(e);
    //        size ++;
    //        return;
    //    }
    //    if (e.compareTo(node.e) < 0){
    //        add(node.left,e);
    //    } else { //e.compareTo(node.e) > 0
    //        add(node.right,e);
    //    }
    //}
    /**
     * 向以node为根的二分搜索树中插入元素e，递归算法
     * 返回插入新节点后二分搜索树的根
     * @param node
     * @param e
     */
    private Node add(Node node,E e){
        if (node == null){
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0){
            node.left = add(node.left,e);
        }else if (e.compareTo(node.e) > 0){
            node.right = add(node.right,e);
        }
        return node;
    }

    /**
     * 看二分搜索树中是否包含元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(root,e);
    }

    /**
     * 看以node为根的二分搜索树中是否包含元素e, 递归算法
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node,E e){
        if (node == null){
            return false;
        }
        if (e.compareTo(node.e) == 0){
            return true;
        }else if (e.compareTo(node.e) < 0){
            return contains(node.left,e);
        }else { //e.compareTo(node.e) > 0
            return contains(node.right,e);
        }
    }

    /**
     * 二分搜索树的前序遍历
     */
    public void preOrder(){
        preOrder(root);
    }

    /**
     *  前序遍历以node为根的二分搜索树, 递归算法
     * @param node
     */
    private void preOrder(Node node){
        //if (node == null){
        //    return;
        //}
        if (node != null) {
            System.out.println(node.e);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    /**
     *  二分搜索树的非递归前序遍历
     */
    public void preOrderNR(){
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            Node cur = stack.pop();
            System.out.println(cur.e);
            if (cur.right != null) {
                stack.push(cur.right);
            }
            if (cur.left != null){
                stack.push(cur.left);
            }

        }
    }

    /**
     * 二分搜索树的非递归前序遍历(另外一种)
     */
    public  void iteratePreOrder() {
        Stack<Node> stack = new Stack<Node>();
        Node node = root;
        while (node != null || stack.size() > 0) {
            // 当遇到节点时，将所有左节点压入栈中
            while (node != null) {
                System.out.println(node.e);
                stack.push(node);
                node = node.left;
            }
            if (stack.size() > 0) {
                node = stack.pop();
                node = node.right;
            }
        }
    }


    /**
     * 二分搜索树的中序遍历
     */
    public void inOrder(){
        inOrder(root);
    }

    /**
     *  中序遍历以node为根的二分搜索树, 递归算法
     * @param node
     */
    private void inOrder(Node node) {
        if (node != null){
            inOrder(node.left);
            System.out.println(node.e);
            inOrder(node.right);
        }
    }
    /**
     * 二分搜索树的后序遍历
     */
    public void postOrder(){
        postOrder(root);
    }

    /**
     *  后序遍历以node为根的二分搜索树, 递归算法
     * @param node
     */
    private void postOrder(Node node) {
        if (node != null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.println(node.e);
        }
    }

    /**
     * 二分搜索树的层序遍历
     */
    public void levelOrder(){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.println(cur.e);
            if (cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
    }

    /**
     * 寻找二分搜索树的最小元素
     * @return
     */
    public E minimum(){
        if (size == 0){
            throw new IllegalArgumentException("BST is empty!");
        }
        return minimum(root).e;
    }

    /**
     * 返回以node为根的二分搜索树的最小值所在的节点
     * @param node
     * @return
     */
    private Node minimum(Node node) {
        if (node.left == null){
            return node;
        }
        return minimum(node.left);
    }

    /**
     * 寻找二分搜索树的最大元素
     * @return
     */
    public E maximum(){
        if (size == 0){
            throw new IllegalArgumentException("BST is empty!");
        }
        return maximum(root).e;
    }

    /**
     * 返回以node为根的二分搜索树的最大值所在的节点
     * @param node
     * @return
     */
    private Node maximum(Node node) {
        if (node.right == null){
            return node;
        }
        return maximum(node.right);
    }

    /**
     * 从二分搜索树中删除最小值所在节点, 返回最小值
     * @return
     */
    public E removeMin(){
        E ret = minimum();
        root = removeMin(root);
        return ret;
    }

    /**
     * 删除掉以node为根的二分搜索树中的最小节点
     *  返回删除节点后新的二分搜索树的根
     * @param node
     */
    private Node removeMin(Node node) {
        if (node.left == null){
            Node rightNode = node.right;
            node.right = null;
            size --;
            return rightNode;
        }

        node.left = removeMin(node.left);
        return node;
    }

    /**
     * 从二分搜索树中删除最大值所在节点
     * @return
     */
    public E removeMax(){
        E ret = maximum();
        root = removeMax(root);
        return ret;
    }

    /**
     * 删除掉以node为根的二分搜索树中的最大节点
     *  返回删除节点后新的二分搜索树的根
     * @param node
     * @return
     */
    private Node removeMax(Node node) {
        if (node.right == null){
            Node leftNode = node.left;
            node.left = null;
            size --;
            return leftNode;
        }
        node.right = removeMax(node.right);
        return node;
    }

    /**
     * 从二分搜索树中删除元素为e的节点
     * @param e
     */
    public void remove(E e){
        root = remove(root,e);
    }

    /**
     * 删除掉以node为根的二分搜索树中值为e的节点, 递归算法
     *  返回删除节点后新的二分搜索树的根
     * @param node
     * @param e
     * @return
     */
    private Node remove(Node node, E e) {
        if (node == null){
            return null;
        }
        if (e.compareTo(node.e) < 0){
            node.left = remove(node.left,e);
            return node;
        }else if (e.compareTo(node.e) >0){
            node.right = remove(node.right,e);
            return node;
        } else { //e == node.e
            //待删除节点左子树为空
            if (node.left == null){
                Node rightNode = node.right;
                node.right = null;
                size --;
                return  rightNode;
            }
            //待删除节点右子树为空
            if (node.right == null){
                Node leftNode = node.left;
                node.left = null;
                size --;
                return leftNode;
            }

            // 待删除节点左右子树均不为空的情况
            // 找到比待删除节点大的最小节点, 即待删除节点右子树的最小节点
            // 用这个节点顶替待删除节点的位置
            Node successor = minimum(node.right);
            successor.right = removeMin(node.right);
            size ++;
            successor.left = node.left;

            node.left = node.right = null;
            size --;
            return successor;

        }
    }


    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        generateBSTString(root, 0, res);
        return res.toString();
    }

    /**
     * 生成以node为根节点，深度为depth的描述二叉树的字符串
     * @param node
     * @param depth
     * @param res
     */
    private void generateBSTString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + node.e + "\n");
            generateBSTString(node.left, depth + 1, res);
            generateBSTString(node.right, depth + 1, res);
        }
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }

}
