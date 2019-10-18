package day09.demo12;

public class Zi extends Fu {
    public Zi() {
        //super(); //默认向上父类
        System.out.println("子类构造方法执行");
    }

    @Override
    public void eat() {
        System.out.println("吃吃饭饭");
    }
}
