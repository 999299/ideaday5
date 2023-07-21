package work.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Second
 * @version 1.0
 * 2023-07-20 17:00
 * 定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
 */
public class Second {
    public static void main(String[] args) {
        Random random = new Random();
//        创建集合对象
        ArrayList<Integer> objects = new ArrayList<>();
//          在集合中循环添加整数
        for (int i = 0; i < 10; i++) {
            objects.add(random.nextInt(100) + 1);
        }
//        调用方法，把得到的值存储入List中
        ArrayList<Integer> list = ouShu(objects);

        System.out.println(list);
        System.out.println(objects);
    }

    public static ArrayList<Integer> ouShu(ArrayList<Integer> sum) {
//        创建Arraylist集合对象
        ArrayList<Integer> objects = new ArrayList<>();
//判断集合中2的偶数，是偶数就重新添加到到集合中
        for (Integer x : sum) {
            if (x % 2 == 0) {
                objects.add(x);
            }
        }
        return objects;

    }
}
