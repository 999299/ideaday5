package huaqing.com.day1;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author GenericInterfaceImpl2
 * @version 1.0
 * 2023-07-19 18:54
 * 第一种实现类，定义时木有确定泛型的类型
 */
public class GenericInterfaceImpl2<S> implements GenericInterface<S> {
    @Override
    public void eat(S s) {
        System.out.println(s);
    }
}
