package day06.demo02;

public class Demo05PhoneReturn {

    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
    }

    private static Phone getPhone() {
        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "金色";
        one.price = 8222.0;
        return one;
    }

}
