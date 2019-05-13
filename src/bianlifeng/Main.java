package bianlifeng;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {
    static List<Integer> list = new ArrayList();
    static  {
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
    }

    /*思路：1.获取需要反转的链表段
           2.反转该链表
           3.拼接链表
    ******************************开始写代码******************************/
    static String reverse(String input) {
        String[] str  =input.split(",");
        int[] sum = new int[str.length];
        for(int i=0;i<str.length;i++){
            sum[i] = Integer.parseInt(str[i]);
        }
        return "";
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String res;

        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }

        res = reverse(_input);
        System.out.println(res);
    }
}
