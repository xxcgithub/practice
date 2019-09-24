package com.example.xxczijidajianxiangmu.paixu;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/22
 * Time: 13:47
 */
// 插入排序
public class Charupaixu {
    public static void main(String[] args) {
        int[] ints = new int[]{9,8,7,5,6,3,4,2,1};
        pai(ints);
        System.out.println(Arrays.toString(ints));
    }
    public static  void pai(int[] intss){
        //插入排序 第一步 循环 除第一个以为的元素
        for (int i = 1; i < intss.length; i++) {
            if (intss[i] < intss[i - 1]) {
                int temp = intss[i];
                int j;
                for (j = i-1; j >= 0 && temp < intss[j] ; j--){
                    //此时是让前一个值赋给后一个值
                    intss[j+1] = intss[j];
                }
                //循环完成之后，将取出的值，赋到 当前位置
                intss[j+1] = temp;
            }
        }
    }
}
