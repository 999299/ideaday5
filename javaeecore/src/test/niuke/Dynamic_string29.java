package test.niuke;

import java.util.Scanner;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Dynamic_string29
 * @version 1.0
 * @date 2023-07-23 11:27
 * @描述 将一个由英文字母组成的字符串转换成从末尾开始每三个字母用逗号分隔的形式。
 * 输入描述： 一个字符串
 * 输出描述： 修改后的字符串
 * 示例1 输入： hellonowcoder
 * 输出： h,ell,ono,wco,der
 */
public class Dynamic_string29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        StringBuilder str1 = new StringBuilder(str);

        for (int i = str.length() - 3; i > 0; i -= 3) {
            str1.insert(i, ",");
        }
        System.out.println(str1.toString());
    }
}
