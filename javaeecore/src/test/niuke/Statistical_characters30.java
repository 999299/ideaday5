package test.niuke;

import java.util.Scanner;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Statistical_characters30
 * @version 1.0
 * @date 2023-07-23 11:44
 * @描述 给定一个字符串，随机输入一个字母，判断该字母在这个字符串中出现的次数
 */
public class Statistical_characters30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入字符串");
        String string = scanner.next();
        System.out.println("输入判断字符");
        String ch = scanner.next();

        int con = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch.charAt(0)) {
                con++;
            }
        }
        System.out.println(con);
    }
}
