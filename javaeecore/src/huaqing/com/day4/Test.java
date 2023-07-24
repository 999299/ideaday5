package huaqing.com.day4;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * @date 2023-07-24 9:40
 * @描述
 */
public class Test {
    public static void main(String[] args) {
//        MyThread zx = new MyThread("钟兴旺");
//
//        zx.start();
//        for (int i = 0; i < 8; i++) {
//            System.out.println("我是main的进程"+i);
//        }


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("我是" + i);
                }
            }
        }).start();

        for (int i = 0; i < 10; i++) {
            System.out.println("我是main" + i);
        }
    }
}
