package com.example.xxczijidajianxiangmu.arranyTest;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/17
 * Time: 15:58
 */
public class Arrayrtest {
    public static void main(String[] args) {
       //删除元素
        int[] intArr = new int[]{1,2,3,4,5,6};
        int index = 3;
        //创建新的数组
        int[] ints = new int[intArr.length-1];
        //赋值
        for (int i = 0; i < ints.length; i++){
            if (i < index){
                ints[i] = intArr[i];
            }else{
                ints[i] = intArr[i+1];
            }
        }
        intArr = ints;
        System.out.println(Arrays.toString(intArr));
    }
}
