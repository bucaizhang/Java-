package day10.demo06;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃SHIT");
    }

    //子类特有方法
    public void watchHouse() {
        System.out.println("狗看家");
    }
}
