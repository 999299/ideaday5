package test.niuke;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author haizi
 * @version 1.0
 */
public class haizi extends father {
    private int s;

    public haizi(int a, int c, int s) {
        super(a, c);
        this.s = s;
    }

    @Override
    public void ee() {
        System.out.println(getA() + getC());
    }
}
