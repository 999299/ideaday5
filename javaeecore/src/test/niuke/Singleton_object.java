package test.niuke;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Singleton_object
 * @version 1.0
 * @date 2023-07-23 10:24
 * @描述 Singleton类是单例的，每次调用该类的getInstance()方法都将得到相同的实例
 */
public class Singleton_object {
    public static void main(String[] args) {
        Singleton_object si = new Singleton_object();
//        System.out.println(si);
        Singleton a = Singleton.getIns();
        Singleton b = Singleton.getIns();
        System.out.println(a == b);
    }
}

class Singleton {
    private static Singleton ins;

    private Singleton() {
    }

    public static Singleton getIns() {
        return ins;
    }
}
