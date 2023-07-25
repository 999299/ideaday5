package test.food;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * @date 2023-07-25 10:47
 * @描述
 */
public class Test {
    public static void main(String[] args) {
        CaiLiao cl = new CaiLiao();

        Food f = new Food("钟兴旺", cl);

        Eat l = new Eat("龙坊", cl);

        f.start();
        l.start();
    }
}
