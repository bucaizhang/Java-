package day06.demo02;

public class Demo04PhoneParm {

    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 8388.1;
        one.color = "金色";
        method(one);

    }

    private static void method(Phone param) {
        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);
    }
}
