package day10.demo01;

public class Demo04Interface {

    public static void main(String[] args) {
        MyInterfacePrivateB.methodStatic1();
        MyInterfacePrivateB.methodStatic2();
        // 错误写法！
//        MyInterfacePrivateB.methodStaticCommon();//这个共有方法不应该让实现类使用，应该是私有化的。
    }
}
