package com.example.xxczijidajianxiangmu.java8;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/23
 * Time: 20:55
 */
public class CallBackTest {
    public static void main(String[] args) {
        CallBackTest callBackTest = new CallBackTest();
        callBackTest.get1("111", new CallBackInTest() {
            @Override
            public void get() {
                System.out.println("222");
            }
        });
    }


    public void get1 (String name, CallBackInTest callBackInTest){
        System.out.println(name);
        callBackInTest.get();
    }
}
