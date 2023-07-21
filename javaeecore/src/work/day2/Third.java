package work.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Third
 * @version 1.0
 * 2023-07-20 17:00
 * 定义以指定格式打印集合的方法(ArrayList类型作为参数)，使用{}扩起集合，使用@分隔每个元素。格式参照   {元素@元素@元素}。
 * ,ArrayList y,ArrayList z,ArrayList c
 */
public class Third {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("12");
        objects.add("3");
        fun(objects);
    }

    public static void fun(ArrayList<?> list) {
        StringBuilder result = new StringBuilder();
        result.append("{");
        int size = list.size();

        for (int i = 0; i < size; i++) {
            result.append(list.get(i));
            if (i < size - 1) {
                result.append("@");
            }
        }

        result.append("}");
        System.out.println(result);
    }


}
