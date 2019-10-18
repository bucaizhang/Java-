package day09.demo04;

public class Demo01ExtendsMethod {
    public static void main(String[] args) {
        Zi zi = new Zi();

        zi.methodFu();
        zi.methodZi();

        //创建的是new 子类对象，所以优先用子类方法
        zi.method();
    }
}
