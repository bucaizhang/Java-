package day08.demo04;

import java.util.Arrays;

public class Demo02ArrayPractise {
    public static void main(String[] args) {
        String str = "huhehnije84773jodfjo";

        //如何进行升序排列：sort
        //必须是一个数组，才能用Arrays.sort方法
        //String -->数组，用toCharArray
        char[] chars = str.toCharArray();
        Arrays.sort(chars);//字符数组进行升序排列
        System.out.println(chars);
        System.out.println("===================");

        //需要倒序遍历
        for (int i = chars.length - 1; i > 0; i--) {
            System.out.println(chars[i]);
        }
    }
}
