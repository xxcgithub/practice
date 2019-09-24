package com.example.xxczijidajianxiangmu.digui;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/20
 * Time: 18:52
 */
public class Feibonaqie {
    public static void main(String[] args) {
        // 1,1,2,3,5,8,13,21
        System.out.println(Feibonaqie.getM(4));
    }
    public static  int getM (int i){
        if (i == 1 || i == 2){
            return 1;
        }else {
            return getM(i - 1)+getM(i - 2);
        }
    }
}
