package com.example.xxczijidajianxiangmu.stackTest;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 11:14
 */
public class StackTest {
    private int[] ints;
    public StackTest (){
        ints = new int[0];
    }
    //入栈方法
    public void ru (int elemnet){
        int[] newInt = new int[ints.length+1];
        for (int i = 0; i < ints.length; i++){
            newInt[i] = ints[i];
        }
        newInt[ints.length+1] = elemnet;
        ints = newInt;
    }
    //出栈方法 注意为空判断
    public int chu (){
        if (ints.length == 0){
            throw new  RuntimeException("is empty");
        }
        int[] newInt = new int[ints.length-1];
        for (int i = 0; i < newInt.length; i++){
            newInt[i] = ints[i];
        }
        ints = newInt;
        int element = ints[ints.length];
        return element;
    }
    //查看栈顶元素 注意为空判断
    public int kan (){
        if (ints.length == 0){
            throw new RuntimeException("is empty");
        }
        int element = ints[ints.length];
        return element;
    }
    //查看是否为空
    public boolean cha(){
        return ints.length == 0;
    }
}
