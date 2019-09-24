package com.example.xxczijidajianxiangmu.digui;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/20
 * Time: 18:46
 */
public class DiguiTest {
    public static void main(String[] args) {
        DiguiTest.getMess(4);
    }
    public static  void getMess (int i) {
        if (i > 0) {
            System.out.println(i);
            i = i - 1;
            getMess(i);

        }
    }
}
