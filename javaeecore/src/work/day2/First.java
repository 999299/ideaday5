package work.day2;

import java.util.*;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * 2023-07-20 16:58
 * 利用学过的单列集合以及其中的方法，使用集合来模拟斗地主发牌的过程。
 * 1.搞出来牌池 54张牌
 * 2.洗牌
 * 3.发牌（保留3张为底牌）
 * 4.看牌
 * 要求：尽量封装方法
 */
public class First {
    public static void main(String[] args) {
        card();
    }

    public static void card() {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();

        for (int i = 1; i < 55; i++) {
            list.add(i);
        }
        System.out.println("未洗牌：" + list);
        Collections.shuffle(list);
        System.out.println("洗牌后：" + list);
        for (int i = 0; i < 17; i++) {
            list2.add(list.remove(0));
            list3.add(list.remove(0));
            list4.add(list.remove(0));
        }
//        Collections.sort(list);
//        Collections.sort(list2);
//        Collections.sort(list3);
//        Collections.sort(list4);
        System.out.println("第一个人的牌：" + list2);
        System.out.println("第二个人的牌：" + list3);
        System.out.println("第三个人的牌：" + list4);
        System.out.println("底牌：" + list);
    }
}
