package linkedList.node;

/**
 * @author Anthony on 2019/4/26
 */
public class MyLinkedList {
    Node head = null;

    /**
     * 求链表长度
     * @return
     */
    public int length(){
        int length = 0;
        Node node = head;
        while(node == null){
            node = node.next;
            length ++;
        }
        return length;
    }

    /**
     * 链表结点排序,并返回排序后的头结点:
     * 选择排序算法,即每次都选出未排序结点中最小的结点，与第一个未排序结点交换
     * @return
     */
    public Node sort(){
        Node cur = head;
        while(cur != null){
            if (cur.data < cur.next.data){
                int temp = cur.data;
                cur.data = cur.next.data;
                cur.next.data = temp;
            }
            cur.next = cur.next.next;
        }
        cur = cur.next;
        return  head;
    }
    /**
     * 打印节点
     */
    public void print(){
        Node cur = head;
        while (cur != null){
            System.out.println(cur.data + "");
            cur = cur.next;
        }
    }

    public void resprint(Node node){

        if (node !=null){
            resprint(node.next);
            System.out.println(node.data + "");
        }
    }

    public void reserveLink(){
        Node curNode = head;//头结点
        Node preNode = null;//前一个结点
        while(curNode != null){
            Node nextNode = curNode.next;//保留下一个结点
            curNode.next = preNode;//指针反转
            preNode = curNode;//前结点后移
            curNode = nextNode;//当前结点后移
        }
        head = preNode;
    }
}
