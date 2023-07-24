package huaqing.com.day3;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Administrator
 * @author 钟兴旺
 * @author Abnormal
 * @version 1.0
 * @date 2023-07-21 11:31
 * @描述 异常练习
 */
/*
  1.1异常概念
​     异常，就是不正常的意思。在生活中，医生说，你的身体某个部位有异常，
    该部位和正常的相比有点不同，该部位的功能受影响，在程序中的意思是，程序受阻，无法运行了。
​     异常：指的是程序在执行过程中，出现的非正常的情况。最终会导致jvm的非正常停止，
        在java等面向对象的语言中，异常本就是一个类，产生异常就是创建异常对象并抛出一个异常对象。java处理异常的方式是中断处理。
  注意：
​    异常指的并不是语法错误，如果语法错误了，编译不通过，不会产生字节码文件，根本不能运行。

1.2 异常体系
  异常机制其实是帮助我们找到程序中的问题的，异常的根类是java.lang.Throwable，
  其下有两个子类，java.lang.Error 和java.lang.Exception，平常我们所说的异常指的是后者。

  error： 严重错误 Error 无法通过处理而解决的问题，只能事先避免。
  Exception：表示异常，异常产生后程序员可以通过代码的方式修改，使程序继续运行，当然遇到的异常修改代码是必须的过程。

1.2.1 Throwable中的常用方法
   public void printStackTrace() 打印异常的详细信息，包含了异常的类型，异常的原因，
   还包括异常出现的位置，在开发和调试阶段，都得使用此方法。
   public String getMessage() 获取发生异常的原因，提示给用户的时候，就提示错误原因。（其实是获取构造方法中的message）
   public String toString()  获取异常的类型和异常描述信息

1.3 异常的分类
   异常（Exception）的分类：根据在编译时期还是运行时期取检查异常分为两大类。
   编译时期异常：checked异常，在编译时期，就会检查，如果没有处理异常，则编译失败。
   运行时期异常：runtime异常，在运行时期，检查异常，在编译时期，玉兴异常不会编译器检测（不会报错）

1.4 异常产生过程解析
先运行下面的程序，程序会产生一个数组索引越界异常，ArrayIndexOutOfBoundsException

# 异常处理
  java处理异常的5个关键字：throw，throws，try，catch，finally
2.1 抛出异常 throw
​    在编写程序时，我们必须要考虑程序出现的问题的情况，比如，在定义方法时，方法需要接收参数。
    那么，当调用方法使用接收到的参数时，首先需要对参数数据进行合法判断，数据若不合法，就应该告知调用者，传递合法的参数进来，
    这时就需要使用抛出异常的方式来告知调用者。

​    在java中，提供了一个throw关键字，他用来抛出一个指定的异常对象，那么抛出一个异常具体如何操作？
​    1.创建一个异常对象，封装一些提示信息，信息可以自定义。
​    2.需要将这个异常对象告知给调用者，如何告知？通过throw关键字就可以完成， throw 异常对象
​    throw关键字用在方法内部，用来抛出一个异常对象，将这个异常对象传递到调用者处，并结束当前方法的执行。
格式：    throw new 异常类名("异常产生的原因")

例如：
​    throw new NullPointerException("访问的arr数组不存在了")
​    throw new ArrayIndexOutOfBoundsException("该索引在数组中不存在，超出范围")

throw关键字的作用：可以在指定的方法中抛出指定的异常
注意：
1. throw 关键字必须写在方法内
2. throw关键字后面new的对象必须是Exception或者是Exception的子类对象
3. throw关键字抛出指定的异常对象，我们就必须处理这个异常对象
    throw关键字后面创建的是RuntimeException或者是RuntimeException的子类对象，
    我们可以不处理，默认交给jvm处理，打印异常信息，中断程序。throw关键字后面根的是编译期异常，我们就必须处理，要么throws（声明抛出异常）要么try catch

练习：
​    定义一个数组，传入一个方法，访问数组元素，判断下表是否越界，如果越界，抛出一个异常，否则输出元素。

注意：
​    如果产生了问题，我们会通过throw将问题描述类（即异常）进行抛出，也就是将问题返回给该方法的调用者。

思考：那么对于调用来说，该怎么处理？
2.2 声明异常  throws
   声明异常：将问题标识出来，报告给调用者，如果方法内通过throw抛出了编译时异常，而没有捕获处理，那么必须通过throws进行声明，让调用者去处理。
  throws关键运用在方法声明上，用于表示当前方法不处理异常，而是提醒该方法的调用者来处理异常。

使用格式： 在方法声明处使用
   修饰符 返回值类型 方法名(参数列表) throws XXXException,YYYException,,,{
​		   throw new XXXException();
​           throw new YYYException();

throws声明异常，若该方法中可能有多种异常情况产生，那么throws后面可以写多个异常类，用逗号隔开
}

注意：
​       1.throws关键字必须写在方法声明上
​       2.throws关键字后面的声明异常必须是Exception或者是其子类
​       3.方法内部如果抛出多个异常对象，那么throws后面必须根多个声明异常，但是如果抛出的多个异常对象有父子关系，那么直接声明父类异常即可。
​       4.调用了一个声明抛出异常的方法，我们就必须要处理声明的异常，要么继续使用throws声明抛出，交给方法的调用者去处理，最终交给JVM，要么try...catch自己处理异常。

2.3 捕获异常 try...catch
  如果异常出现的话，会立即终止程序，所以我们要处理异常。
​    1.该方法不处理，而是声明抛出，由该方法的调用者来处理
​    2.在方法中使用 try catch的语句块来处理异常，try catch的方式是捕获异常。
捕获异常：java中对异常有针对性的语句进行捕获，可以对出现的异常进行指定的方式处理。

格式：
​      try{
​		可能产生异常的代码
}catch(定义一个异常的变量，用来接收try中抛出的异常对象){
​       异常处理的逻辑，异常对象产生后，怎么处理异常对象
​       一般情况下，会把异常的信息记录到一个日志系统中
}...catch(异常类名 变量名){}

注意：
​    1. try：该代码块中编写可能产生异常的代码
​    2. catch：用来进行某种异常的捕获，实现对捕获到的异常进行处理。
​    3. try 和catch 都不能单独使用  必须连用
    4. try中可能会抛出多个异常对象，那么就可以使用多个catch来处理这些异常对象
    5. 如果try中产生了异常，那么就会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，
    继续执行try..catch之后的代码，如果try中没有产生异常，就不会执行catch中的异常处理逻辑，执行完try中的代码直接执行后续代码。

2.4 finally代码块
 finally：有一些特定的代码无论是否发生异常，都需要执行。另外，因为异常会引发程序的跳转，导致有些语句执行不到，而finally就是解决这个问题的，在finally代码块中存放的代码一定会被执行。
    什么时候的代码必须执行？
   当我们在try语句块中打开了一些物理资源（磁盘文件/网络连接/数据库连接等等）我们都需要在使用完之后，最终关闭打开的资源。

finally语法：
   try{
​    可能产生异常的代码
}catch(异常类型 变量名){
​     异常处理逻辑
}finally{
​    无论是否发生异常都要执行的代码
}
注意：
​     1.finally不能单独使用
​     2.finally一般用于资源回收，无论程序是否发生异常，最后都要释放的资源
​     3.finally代码块中避免出现retrun语句


2.5 异常注意事项
   多个异常如何处理？
   1.多个异常分别处理
   2.多个异常依次捕获，多次处理
   3.多个异常一次捕获，一次处理，一般我们使用的是一次捕获多次处理的方式。
  格式如下：
​       try{
​      编写有可能出现异常的代码

}catch(异常类型A e){
​     当try中出现A类型异常，就用该catch捕获
​     处理异常的逻辑
}catch(异常类型B e){
​     当try中出现B类型异常，就用该catch捕获
​    处理异常的逻辑
}
注意：这种异常处理方式，要求多个catch中的异常不能相同，并且若catch中的多个异常之间存在父子关系，
那么子类异常要求在上面的catch，父类异常写在下面的catch处理。


总结：

​    1.运行时期异常被抛出可以不处理，即不捕获也不处理
​    2.如果finally有return语句，永远返回finally中的结果，避免该情况。
​    3.如果父类抛出了多个异常，子类重写父类方法时，抛出和父类相同的异常或者是父类异常的子类或者不抛出
​    4.父类方法中没有抛出异常，子类重写父类方法时，也不可以抛出异常，此时子类产生异常只能捕获处理不能声明抛出

# 自定义异常
3.1概述
​    为什么需要自定义异常类，我们说了java中不同的异常类，分别代表着某一种具体的异常情况，
那么在开发中总有一些异常情况是jdk中没有定义好的，此时我们可以根据自己的业务的异常情况来定义异常类。
例如：年龄是负数，考试成绩为负数等等。在上午的学习中，我们用到的异常类都是jdk内部定义好的，
实际开发中的异常情况有可能jdk中没有，那么能否自定义异常类？

什么是自定义异常类？
​    在开发中根据自己业务的异常情况来定义异常类。
自己定义一个业务逻辑异常：
 RegisterException  一个注册异常类
异常类如何定义
​    1.自定义一个编译期异常，自定义类继承自java.lang.Exception
​    2.自定义一个运行时期的异常，自定义类继承自java.lang.RuntimeException
练习：
​    需求：模拟注册操作，如果用户名已经存在，则抛出异常提示，亲，该用户已经被注册。
 */
public class Abnormal {
    public static int ArrayIndexOutOfBoundsException(int[] arr, int index) {
        return arr[index];
    }

    public static int getElement(int[] arr, int index) {
        //判断是否越界
        if (index < 0 || index > arr.length - 1) {
            /*
                判断条件满足，当执行完throw抛出异常对象后，方法已经无法继续运算
                这时就会结束当前方法的执行，并将异常告知给调用者，这是就需要通过异常来解决
             */
            throw new ArrayIndexOutOfBoundsException("越界了~~~~~~");
        }
        return arr[index];
    }

    public static void read(String path) throws FileNotFoundException {
        if (!path.equals("a.txt")) {
            //假设如果不是a.txt文件 认为该文件不存在 是一个错误 也就是异常
            throw new FileNotFoundException("文件不存在");
        }
    }

    public static void read1(String path) throws IOException {
        if (!path.equals("lf.txt")) {
            throw new FileNotFoundException("龙坊是傻瓜，不存在");
        }
    }

    public static void finalDemo(String path) throws FileNotFoundException, IOException {
        if (!"zxw.x".equals(path)) {
            throw new FileNotFoundException("文件不存在");
        } else if (!"lf.x".equals(path)) {
            throw new IOException();
        } else {
            System.out.println("正常");
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

//产生一个数组索引越界异常，ArrayIndexOutOfBoundsException
//        int[] arr = {11,22,33};
//        int element = getElement(arr, 4);
//        System.out.println(element);

//        try {
//            read1("zxw");
//        }catch (Exception e){
//            throw new FileNotFoundException("简洁");
//        }

        try {
            finalDemo("zxw.x");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("不管你对与错，我都在");
        }


    }
}
