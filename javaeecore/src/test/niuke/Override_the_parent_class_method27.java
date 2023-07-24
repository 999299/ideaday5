package test.niuke;

import java.util.Scanner;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Override_the_parent_class_method27
 * @version 1.0
 * @date 2023-07-21 19:58
 * @描述 父类Base中定义了若干get方法，以及一个sum方法，sum方法是对一组数字的求和。
 * 请在子类 Sub 中重写 getX() 方法，使得 sum 方法返回结果为 x*10+y
 * 输入描述：
 * 整数
 * 输出描述：
 * 整数的和
 * 示例1
 * 输入：
 * 1 2
 * 复制
 * 输出：
 * 12
 */
public class Override_the_parent_class_method27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            Sub sub = new Sub(x, y);
            System.out.println(sub.sum());
        }
    }

}


