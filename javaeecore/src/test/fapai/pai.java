package test.fapai;

import java.util.ArrayList;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author pai
 * @version 1.0
 */
public class pai {

    public void hong() {
        StringBuffer st = new StringBuffer();
        ArrayList<StringBuffer> ar = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            StringBuffer s = st.append("红桃" + i + " ");
            ar.add(s);
        }


    }

    public StringBuilder hei() {
        StringBuilder st = new StringBuilder();
        for (int i = 2; i < 11; i++) {
            st.append("黑桃" + i + " ");
        }
        return st;
    }

    public StringBuilder fang() {
        StringBuilder st = new StringBuilder();
        for (int i = 2; i < 11; i++) {
            st.append("方块" + i + " ");
        }
        return st;
    }

    public StringBuilder mei() {
        StringBuilder st = new StringBuilder();
        for (int i = 2; i < 11; i++) {
            st.append("梅花" + i + " ");
        }
        return st;
    }

    public StringBuilder A() {
        StringBuilder st = new StringBuilder();

        char x = 'A';
        st.append("黑桃" + x + " ");
        st.append("红桃" + x + " ");
        st.append("方块" + x + " ");
        st.append("梅花" + x + " ");
        return st;
    }

    public StringBuilder J() {
        StringBuilder st = new StringBuilder();

        char x = 'J';
        st.append("黑桃" + x + " ");
        st.append("红桃" + x + " ");
        st.append("方块" + x + " ");
        st.append("梅花" + x + " ");
        return st;
    }

    public StringBuilder Q() {
        StringBuilder st = new StringBuilder();

        char x = 'Q';
        st.append("黑桃" + x + " ").append("红桃" + x + " ").append("方块" + x + " ").append("梅花" + x + " ");
        return st;
    }

    public StringBuilder K() {
        StringBuilder st = new StringBuilder();

        char x = 'K';
        st.append("黑桃" + x + " ").append("红桃" + x + " ").append("方块" + x + " ").append("梅花" + x + " ");
        return st;
    }

    public StringBuilder king() {
        StringBuilder st = new StringBuilder();

        st.append("大王" + " ").append("小王" + " ");

        return st;
    }
}
