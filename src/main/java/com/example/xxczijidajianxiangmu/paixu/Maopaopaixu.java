package com.example.xxczijidajianxiangmu.paixu;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/22
 * Time: 14:05
 */
// 冒泡排序
public class Maopaopaixu {
    public static void main(String[] args) {
        int[] ints = new int[]{0,1,9,2,8,3,7,4};
        getP(ints);
        System.out.println(Arrays.toString(ints));
    }
    public static  void getP(int[] ints) {
        //思路  和后面每一个相比，大的 就互换 ，直到倒数第二个结束
        for (int i = 0; i < ints.length-1; i++){
            //此时再加一个for循环 目的是 让每个值都比一遍
            for (int j = 0; j < ints.length-1-i; j++){
                if (ints[j] > ints[j+1]){
                    int temp = ints[j];
                    ints[j] = ints[j+1];
                    ints[j+1] = temp;
                }
            }
        }
    }
}
