/**
 * Copyright (C), 2018-2019
 * FileName: Set
 * Author:   sky丶风
 * Date:     2019/5/7 21:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package tree;

/**
 * @author Anthony on 2019/5/7
 */
public interface Set<E> {
    void add(E e);
    void remove(E e);
    boolean contains(E e);
    int getSize();
    boolean isEmpty();
}