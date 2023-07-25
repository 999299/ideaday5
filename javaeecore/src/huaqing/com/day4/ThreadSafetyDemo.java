package huaqing.com.day4;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author ThreadSafetyDemo
 * @version 1.0
 * @date 2023-07-24 18:42
 * @描述
 */
public class ThreadSafetyDemo implements Runnable {
    private int tic = 100;

    @Override
    public void run() {
        GrabVotes();
    }

    public synchronized void GrabVotes() {
        while (true) {
            if (tic > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在为你抢第" + tic-- + "票");
            }
        }
    }
}
