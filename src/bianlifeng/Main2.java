package bianlifeng;





import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author Anthony on 2019/5/6
 */
public class Main2 {
    public static void main(String[] args) {
        String s = "ABADABABACABACAD";
        String c = "ABACA";
        through(s,c);
    }
    public static int through(String parent,String child){
        int count = 0;
        Queue<Character> queue =in(child);
        while(!queue.isEmpty()) {
            for (int j = 0; j < parent.length(); j++) {
                char c = parent.charAt(j);
                if (c == queue.peek()) {
                    queue.poll();
                }else {
                    if (j == parent.length()-1){
                        return -1;
                    }
                    queue.clear();
                    in(child);
                }
                count++;
            }
        }
        return count;
    }
    public static Queue<Character> in(String child){
        Queue<Character> queue = new ArrayDeque<>();

        for(int i = 0 ; i < child.length() ; i ++) {
            char c = child.charAt(i);
            queue.offer(c);
        }
        return queue;
    }
}
