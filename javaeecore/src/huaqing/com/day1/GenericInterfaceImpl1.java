package huaqing.com.day1;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author GenericInterfaceImpl1
 * @version 1.0
 * 2023-07-19 17:22
 * 第一种实现类泛型，定义时泛型类型确定
 */
public class GenericInterfaceImpl1 implements GenericInterface<String> {

    @Override
    public void eat(String s) {
        System.out.println(s);
    }
}
