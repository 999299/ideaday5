package huaqing.com.day4;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Mythread
 * @version 1.0
 * @date 2023-07-24 9:38
 * @描述
 */
public class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 9; i++) {
            System.out.println(getName() + "嗨嗨，我是新的进程" + i);
        }
    }
}
