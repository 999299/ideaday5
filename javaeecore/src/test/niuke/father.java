package test.niuke;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author father
 * @version 1.0
 */
public class father {
    private int a;
    private int c;

    public father(int a, int c) {
        this.a = a;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void ee() {
        System.out.println(getA() + getC());
    }
}
