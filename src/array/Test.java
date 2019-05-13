package array;

/**
 * @author Anthony on 2019/3/24
 */
public class Test {

    public static void main(String [] args){
        Array arr = new Array(20);
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);

        testArrayT();
    }

    public static void testArrayT(){
        ArrayT<Integer> arr = new ArrayT<Integer>(20);
        for(int i = 0 ; i < 10 ; i ++){
            arr.addLast(i);
        }
        System.out.println(arr);

        arr.add(1,100);
        System.out.println(arr);

        arr.addFirst(-1);
        System.out.println(arr);

        arr.remove(2);
        System.out.println(arr);

        arr.removeElement(4);
        System.out.println(arr);

        arr.removeFirst();
        System.out.println(arr);
    }
}
