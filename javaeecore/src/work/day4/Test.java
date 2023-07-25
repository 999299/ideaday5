package work.day4;

import java.util.Scanner;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * @date 2023-07-24 18:58
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double save = scanner.nextInt();
//        double  Pick = scanner.nextInt();

        SaveMoney saveMoney = new SaveMoney();

        Thread sa = new Thread(saveMoney, "zxw");
        Thread pi = new Thread(saveMoney, "lf");

        sa.start();
        pi.start();

    }
}
