package huaqing.com.day5;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * @date 2023-07-25 9:25
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        BaoZi bz = new BaoZi();
        BunShop l = new BunShop("钟兴旺", bz);

        Foodie z = new Foodie("龙坊", bz);

        l.start();
        z.start();
    }
}
