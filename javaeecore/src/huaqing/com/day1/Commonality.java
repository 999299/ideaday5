package huaqing.com.day1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Commonality
 * @version 1.0
 * 2023-07-19 16:31
 * 共性学习测试，七个方法
 */
public class Commonality {
    public static void main(String[] args) {
        Collection<Object> ob = new ArrayList<>();

        ob.add("钟兴旺");
        ob.add(12);
        ob.add("龙坊");
        ob.add(11);
        ob.add("测试");
        Iterator<Object> iterator = ob.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        Integer i = (Integer) iterator.next();

        Iterator<Object> ww = ob.iterator();
        while (ww.hasNext()) {
            System.out.println(ww.next());
        }
//        Iterator<Object> iterator = ob.iterator();
//        while (iterator.hasNext()){
//            String s = (String) iterator.next();
//            System.out.println(s);
//        }


//        System.out.println(ob);
//
//        System.out.println(ob.size());
//
//        System.out.println(ob.contains("测试"));
//
//        System.out.println(ob.isEmpty());
//
//        System.out.println(ob.remove("测试"));
//
//        Object[] zx = ob.toArray();
//
//        for (int i = 0; i <zx.length ; i++) {
//            System.out.println(zx[i]);
//        }
//
//        ob.clear();
//
//        System.out.println(ob.isEmpty());
    }
}
