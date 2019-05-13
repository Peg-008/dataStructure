package array;

/**
 * @author Anthony on 2019/3/13
 */
public class ArrayT<E> {
    private int size;
    private E [] data;

    /**
     * 构造函数，传入数组的容量capacity构造Array
     * @param capacity
     */
    public ArrayT(int capacity){
        data= (E[]) new Object[capacity];
        size = 0;
    }

    /**
     * 无参数的构造函数，默认数组的容量capacity=10
     */
    public ArrayT(){
        this(10);
    }

    /**
     * 获取数组中的元素个数
     * @return
     */
    public int getSize(){
        return size;
    }
    /**
     * 获取数组的容量
     */
    public int getCapacity(){
        return data.length;
    }
    /**
     * 判断数组是否为空
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 向数组头部位置添加元素
     * @param e
     */
    public void addFirst(E e){
        add(0,e);
    }
    /**
     * 向数组尾端添加元素
     * @param e
     */
    public void addLast(E e){
        //if(size == data.length){
        //   throw new IllegalArgumentException("AddLast failed.Array is full!");
        //}
        //data[size] = e;
        //size++;
        add(size,e);
    }

    /**
     * 在第index位置插入新元素e
     * @param index
     * @param e
     */
    public void add(int index,E e){
        if(size == data.length){
            throw new IllegalArgumentException("Add failed.Array is full!");
        }
        if(index<0 || index > size){
            throw new IllegalArgumentException("Add failed.Require index >= 0 and index < size!");
        }
        for(int i = size-1;i >= index;i--){
            data[i+1]=data[i];
        }
        data[index]=e;
        size++;
    }
    //获取index索引位置的元素
    E get(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Get failed.Index is illegal!");
        }
        return  data[index];
    }
    //修改index索引位置的元素为e
    void set(int index,E e){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Set failed.Index is illegal!");
        }
        data[index]=e;
    }
    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array:size = %d ,capacity = %d\n",size,data.length));
        res.append('[');
        for(int i = 0 ; i < size ; i ++){
            res.append(data[i]);
            if(i != size - 1){
                res.append(", ");
            }
        }
        res.append(']');
        return res.toString();
    }
    //查找数组中是否有元素e
    public boolean contains(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i].equals(e)){
                return true;
            }
        }
        return false;
    }
    //查找数组中元素e所在的索引，如果不存在元素e，则返回-1
    public int find(E e){
        for(int i = 0 ; i < size ; i ++){
            if(data[i] == e){
                return i;
            }
        }
        return -1;
    }

    //从数组中删除index位置的元素，返回删除的元素
    public E remove(int index){
        if(index < 0 || index >= size){
            throw new IllegalArgumentException("Remove failed.Index is illegal!");
        }
        E ret =data[index];
        for(int i = index + 1 ; i< size ; i ++){
            data[i-1] = data[i];
        }
        size --;
        //利于垃圾回收
        //loitering objects != memory leak
        data[size] = null;
        return ret;
    }

    // 从数组中删除第一个元素, 返回删除的元素
    public E removeFirst(){
        return remove(0);
    }

    // 从数组中删除最后一个元素, 返回删除的元素
    public E removeLast(){
        return remove(size-1);
    }

    // 从数组中删除元素e
    public void removeElement(E e){
        int index = find(e);
        if(index != -1) {
            remove(index);
        }
    }
}
