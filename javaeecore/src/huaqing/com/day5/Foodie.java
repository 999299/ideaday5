package huaqing.com.day5;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Foodie
 * @version 1.0
 * @date 2023-07-25 10:14
 * @描述 吃
 */
public class Foodie extends Thread {
    private BaoZi bz;

    public Foodie(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    public void run() {
        while (true) {
            synchronized (bz) {
                if (bz.flag == false) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("龙坊正在吃" + bz.pi + bz.xian + "的包子");
                bz.flag = false;
                bz.notify();
            }
        }
    }
}
