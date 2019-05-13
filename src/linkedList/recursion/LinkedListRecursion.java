package linkedList.recursion;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Anthony on 2019/5/6
 * 递归实现的LinkedList
 * 类名称中Recursion表示递归实现
 */
public class LinkedListRecursion<E> {
    private class Node{
        public Node next;
        public E e;

        public Node (Node next,E e){
            this.next = next;
            this.e = e;
        }
        public Node (Node next){
            this(next,null);
        }

        public Node (E e){
            this(null,e);
        }
        public Node(){
            this(null,null);
        }
        @Override
        public String toString(){
            return e.toString();
        }
    }

    private Node head;
    private int size;

    public LinkedListRecursion(){
        head = null;
        size = 0;
    }

    /**
     * 获取链表中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }

    /**
     * 链表是否为空
     * @return
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 在链表的index(0-based)位置添加新的元素e
     * @param index
     * @param e
     */
    public void add(int index,E e){
        if (index < 0 || index > size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        //递归增
        head = add(head,index,e);
        size ++;
    }

    private Node add(Node node, int index, E e) {
        if (index == 0){
            return new Node(node,e);
        }
       node.next = add(node.next,index - 1,e);
       return node;
    }

    /**
     *  在链表头添加新的元素e
     */
    public void addFirst(E e){
        add(0,e);
    }

    /**
     * 在链表末尾添加新的元素e
     * @param e
     */
    public void addLast(E e){
        add(size,e);
    }

    /**
     * 获得链表的第index(0-based)个位置的元素
     * @param index
     * @return
     */
    public E get(int index){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed. Illegal index.");
        }
        return get(head,index);
    }

    /**
     * 在以node为头结点的链表中，找到第index个元素，递归算法
     * @param node
     * @param index
     * @return
     */
    private E get(Node node, int index) {
        if (index == 0){
            return node.e;
        }
        return get(node.next,index - 1);
    }

    /**
     * 获得链表的第一个元素
     * @return
     */
    public E getFirst(){
       return get(0);
    }

    /**
     *  获得链表的最后一个元素
     * @return
     */
    public E getLast(){
        return get(size-1);
    }

    /**
     * 修改链表的第index(0-based)个位置的元素
     * @param index
     * @return
     */
    public void set(int index,E e){
        if (index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed. Illegal index.");
        }
        set(head,index,e);
    }

    /**
     * 修改以node为头结点的链表中，第index(0-based)个位置的元素为e，递归算法
     * @param node
     * @param index
     * @param e
     */
    private void set(Node node, int index, E e) {
        if (index == 0){
            node.e  = e;
            return;
        }
        set(node.next,index-1,e);
    }

    /**
     *  查找链表中是否有元素e
     * @param e
     * @return
     */
    public boolean contains(E e){
        return contains(head,e);
    }

    /**
     * 在以node为头结点的链表中，查找是否存在元素e，递归算法
     * @param node
     * @param e
     * @return
     */
    private boolean contains(Node node, E e) {
        if (node == null){
            return false;
        }
        if (e.equals(node.e)){
            return true;
        }
        return contains(node.next,e);
    }

    /**
     * 从链表中删除index(0-based)位置的元素, 返回删除的元素
     * @param index
     * @return
     */
    public E remove(int index){
        if(index < 0 || index >= size) {
            throw new IllegalArgumentException("Remove failed. Index is illegal.");
        }
        Pair<Node, E> res = remove(head, index);
        size --;
        head = res.getKey();
        return res.getValue();
    }

    /**
     * 从以node为头结点的链表中，删除第index位置的元素，递归算法
     * 返回值包含两个元素，删除后的链表头结点和删除的值
     * @param node
     * @param index
     * @return
     */
    private Pair<Node, E> remove(Node node, int index) {
        if(index == 0) {
            return new Pair<>(node.next, node.e);
        }
        Pair<Node, E> res = remove(node.next, index - 1);
        node.next = res.getKey();
        return new Pair<>(node, res.getValue());
    }

    /**
     * 从链表中删除第一个元素, 返回删除的元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 从链表中删除最后一个元素, 返回删除的元素
     * @return
     */
    public E removeLast(){
        return remove(size-1);
    }

    /**
     * 从链表中删除元素e
     * @param e
     * @return
     */
    public void removeElement(E e){
        if (e == null){
            throw new NullPointerException("Element is null!");
        }
        head = removeElement(head,e);
    }

    /**
     * 从以node为头结点的链表中，删除元素e，递归算法
     * @param node
     * @param e
     * @return
     */
    private Node removeElement(Node node, E e) {
        if (node == null){
            return null;
        }
        if (e.equals(head.e)){
            size --;
            return node.next;
        }
        node.next = removeElement(node.next,e);
        return node;
    }

    /**
     * 逆序打印链表
     */
    public void reprint(){
        reprint(head);
    }

    private void reprint(Node node){
        if (node != null){
            reprint(node.next);
            System.out.print(node.e + " ");
        }
    }

    /**
     * 顺序打印链表
     */
    public void print(){
        print(head);
    }

    private void print(Node node){
        if (node != null){
            System.out.print(node.e + " ");
            print(node.next);
        }
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();

        Node cur = head;
        while(cur != null){
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("NULL");

        return res.toString();
    }

    public static void main(String[] args) {

        Map<String,String> map = new HashMap<>();


        LinkedListRecursion<Integer> linked = new LinkedListRecursion<>();
        linked.addFirst(10);
        System.out.println(linked.toString());
        for(int i = 0 ; i < 10 ; i ++) {
            linked.addLast(i);
            System.out.println(linked.toString());
        }
        System.out.println(linked);

        linked.reprint();
        System.out.println();
        linked.print();
        //int index = linked.get(5);
        //System.out.println(index);
        //while(!linked.isEmpty()) {
        //    System.out.println("removed " + linked.removeLast());
        //    System.out.println(linked);
        //}
    }

}
