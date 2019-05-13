/**
 * Copyright (C), 2018-2019
 * FileName: Stack
 * Author:   sky丶风
 * Date:     2019/4/6 20:49
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Anthony
 * @create 2019/4/6
 * @since 1.0.0
 */
public interface Stack<E> {
    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}