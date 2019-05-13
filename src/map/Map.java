/**
 * Copyright (C), 2018-2019
 * FileName: Map
 * Author:   sky丶风
 * Date:     2019/5/9 8:45
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package map;

/**
 * @author Anthon
 * @create 2019/5/9
 * @since 1.0.0
 */
public interface Map<K,V> {
    void add(K key,V value);
    V remove(K key);
    boolean contains(K key);
    V get(K key);
    void set(K key,V newValue);
    int getSize();
    boolean isEmpty();
}