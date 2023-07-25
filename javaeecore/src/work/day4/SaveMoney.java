package work.day4;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author SaveMoney
 * @version 1.0
 * @date 2023-07-24 18:53
 * @描述 模拟银行存取钱，取钱线程1，存钱线程2，
 * 要求输入内容，
 * XXX存入，显示余额，
 * XXX取出，显示账户余额  余额开始为0
 */
public class SaveMoney implements Runnable {
    private int balance = 0;
    private int pi = (int) ((Math.random()) * 10 + 1) * 1000;
    
    private int sa = (int) ((Math.random()) * 10 + 1) * 1000;
    //     Object ob= new Object();
    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        lock.lock();

        System.out.println("你现在的余额为：" + balance);

        balance = (int) ((Math.random()) * 10 + 1) * 1000;

        System.out.println(Thread.currentThread().getName() + "直接存入" + balance + "元，现在余额为：" + balance);

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (balance != 0) {
            balance = balance + sa;
            System.out.println(Thread.currentThread().getName() + "成功存入" + sa + "元，现在余额为：" + balance);
        }
        pick();
        lock.unlock();
    }

    public synchronized void pick() {
        if (balance > pi) {
            balance = balance - pi;
            System.out.println(Thread.currentThread().getName() + "取出" + pi + "元，现在你的余额为：" + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + "想取" + pi + "元，取钱不成功，因为你的余额不足，余额为：" + balance);
        }
    }
}
//}
