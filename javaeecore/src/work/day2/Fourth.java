package work.day2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Fourth
 * @version 1.0
 * 2023-07-20 17:01
 * 生成6个1~33之间的随机整数,添加到集合,并遍历
 */
public class Fourth {
    public static void main(String[] args) {
//        创建集合对象
        ArrayList<Integer> ob = new ArrayList<>();
//        创建随机对象
        Random random = new Random();
//          循环把随机数存储到集合里面
        for (int j = 0; j < 6; j++) {
            Integer z = random.nextInt(33) + 1;
            ob.add(z);
        }
//        利用迭代器遍历出集合里面的元素
        Iterator<Integer> iterator = ob.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
    }
}
