package huaqing.com.day2.work;

import java.util.*;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * 2023-07-20 14:59
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String zi = scanner.next();
        zxw(zi);

    }

    public static void zxw(String zf) {
        HashMap<Character, Integer> s = new HashMap<>();

        for (int i = 0; i < zf.length(); i++) {
            char zz = zf.charAt(i);
            if (!s.containsKey(zz)) {
                s.put(zz, 1);
            } else {
                Integer co = s.get(zz);
                s.put(zz, ++co);
            }
        }
        System.out.println(s);

    }
}
