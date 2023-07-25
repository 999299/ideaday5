package test.food;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Eat
 * @version 1.0
 * @date 2023-07-25 10:50
 * @描述 吃
 */
public class Eat extends Thread {
    private CaiLiao cl;

    public Eat(String name, CaiLiao cl) {
        super(name);
        this.cl = cl;
    }

    public void run() {
        while (true) {
            synchronized (cl) {
                if (cl.fag == false) {
                    try {
                        cl.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("龙坊正在吃" + cl.type);
                cl.fag = false;
                cl.notify();
            }
        }
    }
}
