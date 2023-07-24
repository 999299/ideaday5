package test.niuke;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Base
 * @version 1.0
 * @date 2023-07-21 20:04
 * @描述
 */
public class Base {
    private int x;
    private int y;

    public Base(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public final int getY() {
        return y;
    }

    public final int sum() {
        return getX() + getY();
    }

}
