package test.niuke;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Sub
 * @version 1.0
 * @date 2023-07-21 20:06
 * @描述
 */
public class Sub extends Base {

    public Sub(int x, int y) {
        super(x, y);
    }

    @Override
    public int getX() {
        return super.getX() * 10;
    }

}
