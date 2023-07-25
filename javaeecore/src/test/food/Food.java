package test.food;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Food
 * @version 1.0
 * @date 2023-07-25 10:48
 * @描述 制作食物
 */
public class Food extends Thread {
    private CaiLiao cl;

    public Food(String name, CaiLiao cl) {
        super(name);
        this.cl = cl;
    }

    public void run() {
        int num = 0;
        while (true) {
            synchronized (cl) {
                if (cl.fag == true) {
                    try {
                        cl.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("等一会，钟兴旺正在努力制作中！");
                num++;
                if (num % 3 == 0) {
                    cl.type = "蛋糕";
                } else if (num % 3 == 1) {
                    cl.type = "脆鸡皮饭";
                } else if (num % 3 == 2) {
                    cl.type = "无毛牛牛";
                }
                System.out.println("食物制作好了，我给你做了" + cl.type);
                cl.fag = true;
                cl.notify();
            }
        }
    }
}
