package linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;

/**
 * @author Anthony on 2019/4/25
 */
public class  MyTest{
    public static void main(String []args){
        List<Integer> list = new ArrayList<>();
        Map<Integer,String> map = new HashMap<>();
        String s="ghhhh";
        byte[]a=s.getBytes();
        System.out.println(s.getBytes());
        System.out.println(a);
        String s1=a.toString();
        String s2=new String(a);
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);


        A b = new B();
        b = new B();
    }

    public void test(int [] sum){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i : sum){
            map.put(i,map.get(i) == null ? i : map.get(i)+1);
        }
        for (int key : map.keySet()){
            System.out.println(key + ":" + map.get(key));
        }

    }
}
class A {
    static{
        System.out.println("1");
    }
    public A(){
        System.out.println("2");
    }
}
class B extends A{
    static {
        System.out.println("A");
    }
    public B(){
        System.out.println("B");
    }
}

