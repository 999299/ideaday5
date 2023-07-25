package huaqing.com.day4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Maipiao
 * @version 1.0
 * @date 2023-07-24 11:29
 * @描述
 */
public class Maipiao implements Runnable {
    private int tic = 100;
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (tic > 0) {
                System.out.println(Thread.currentThread().getName() + "正在卖第" + tic + "张票");
                tic--;
            }
            lock.unlock();
        }
    }
}
