package huaqing.com.day5;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author BunShop
 * @version 1.0
 * @date 2023-07-25 10:22
 * @描述 包子铺
 */
public class BunShop extends Thread {

    private BaoZi bz;

    public BunShop(String name, BaoZi bz) {
        super(name);
        this.bz = bz;
    }

    public void run() {
        int num = 0;
        while (true) {
            synchronized (bz) {
                if (bz.flag == true) {
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("在等等，钟兴旺正在为你制作包子！");
                if (num % 3 == 0) {
                    bz.pi = "薄皮";
                    bz.xian = "牛牛馅";
                } else if (num % 3 == 1) {
                    bz.pi = "厚皮";
                    bz.xian = "脆鸡皮馅";
                } else {
                    bz.pi = "薄皮";
                    bz.xian = "海鲜馅";
                }
                num++;
                bz.flag = true;
                System.out.println(bz.pi + bz.xian + "的包子做好了");
                System.out.println("来吃吧！");
                bz.notify();
            }
        }
    }
}
