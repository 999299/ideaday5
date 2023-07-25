package huaqing.com.day4;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author ThreadSafetyDemoTest
 * @version 1.0
 * @date 2023-07-24 18:48
 * @描述
 */
public class ThreadSafetyDemoTest {
    public static void main(String[] args) {
        ThreadSafetyDemo t = new ThreadSafetyDemo();

        Thread a1 = new Thread(t, "机器人一号");
        Thread a2 = new Thread(t, "机器人二号");

        a1.start();
        a2.start();


    }
}
