package huaqing.com.day1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author iterator
 * @version 1.0
 * 2023-07-19 16:44
 * 迭代器练习       while与for
 */
public class iterator {
    public static void main(String[] args) {
        ArrayList<String> objects = new ArrayList<>();
        objects.add("钟兴旺");
        objects.add("龙坊");
        objects.add("龙坊");
        objects.add("龙坊");

        Iterator<String> iterator = objects.iterator();

        while (iterator.hasNext()) {
            String sd = iterator.next();
            System.out.println(sd);
        }


//        for (Iterator<String> ss = objects.iterator(); ss.hasNext(); ) {
//            String aa = ss.next();
//            System.out.println(aa);
//        }


    }
}
