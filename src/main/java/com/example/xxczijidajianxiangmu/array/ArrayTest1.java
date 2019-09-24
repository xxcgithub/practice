package com.example.xxczijidajianxiangmu.array;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 9:20
 */

//写一个线性查找算法，做个练习

public class ArrayTest1 {
    public int getIndex (int element){
        int[] ints = new int[]{1,2,3,4,5,6,7,8,9};
        //定义一个输出下标
        int index = -1;
        for (int i = 0; i < ints.length; i++){
            if (ints[i] == element){
                index = i;
                break;
            }
        }
        return index;
    }
}
