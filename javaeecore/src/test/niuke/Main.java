//package test.niuke;
//
///**
// * @author Administrator
// * @author 钟兴旺
// * @author Main
// * @version 1.0
// * @date 2023-07-21 19:22
// * @描述
// */
//import java.util.Scanner;
//
//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // Sub是需要你定义的子类
//        Base base = new Sub();
//
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNextInt()) {
//            int x = scanner.nextInt();
//            int y = scanner.nextInt();
//            base.setX(x);
//            base.setY(y);
//            System.out.println(base.calculate());
//        }
//    }
//
//}
//
//abstract class Base {
//
//    private int x;
//    private int y;
//
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
//    public int calculate() {
//        if (avg() == 0) {
//            return 0;
//        } else {
//            return sum() / avg();
//        }
//    }
//
//    /**
//     * 返回x和y的和
//     */
//    public abstract int sum();
//
//    /**
//     * 返回x和y的平均值
//     */
//    public abstract int avg();
//
//}
//
//class Sub extends Base {
//
//    //write your code here......
//
//
//    @Override
//    public int sum() {
//        return getX()+getY();
//    }
//
//    @Override
//    public int avg() {
//        return sum()/2;
//    }
//
//
//}