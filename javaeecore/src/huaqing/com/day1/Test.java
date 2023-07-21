package huaqing.com.day1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Test
 * @version 1.0
 * 2023-07-19 8:43
 * 测试
 */
/*
            java 10个阶段

            1，复习，面对对象思想，三个特征
            2，核心编程，九点：I/O流，反射，多线程（难点），网络编程（了解），
            3，数据库，多表查询，SQL优化，瘦操作，
            4，javaWeb，html，css，JavaScript，vue，sq
            5，javaee   servlet， 监听器，过滤器，服务器
            6，项目，框架：文件配置，权限    微服务，springboot，vue
            7，分布式框架，自动更新，网关，负载均衡（阿里巴巴）
            8，
            9，毕业设计
            10，大数据

            H5

            牛客网，逻辑思维题，粉笔，海投网

 */
public class Test {
    public static void main(String[] args) {
//        Collection<String> con = new ArrayList<>();
//        System.out.println(con.add("钟兴旺"));
//        System.out.println(con.add("龙坊"));
//        System.out.println(con.add("兴旺"));
//        System.out.println(con.remove("兴旺"));
//        System.out.println(con.size());
//        System.out.println(con.isEmpty());
//        Object[] objects = con.toArray();
//        for (int i=0;i<objects.length;i++) {
//            System.out.println(objects[i]);
//        }
//        con.clear();
//        System.out.println(con.isEmpty());
//        fanxing ob= new fanxing<>();
//
//        ob.eat("we");
//        ob.eat(34);

//        MyGenericClass<String> ob = new MyGenericClass<>();
//        ob.eat("钟兴旺");
//
//        GenericMethod zz = new GenericMethod();
//        zz.eat("龙坊");
//        zz.eat(222);

        GenericInterfaceImpl1 g1 = new GenericInterfaceImpl1();
        g1.eat("钟兴旺");

        GenericInterfaceImpl2<String> g2 = new GenericInterfaceImpl2<>();
        g2.eat("龙坊");

        GenericInterfaceImpl2<Integer> g3 = new GenericInterfaceImpl2<>();
        g3.eat(111);


    }
}
