package com.example.xxczijidajianxiangmu.queue;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 11:41
 */
public class Queue1 {
    private int[] ints;
    public Queue1 (){
        ints = new int[0];
    }
    //入队
    public void ru (int element){
        int[] newInt = new int[ints.length+1];
        for (int i = 0; i < ints.length; i++){
            newInt[i] = ints[i];
        }
        newInt[newInt.length-1] = element;
        ints = newInt;
    }
    //出队
    public int chu (){
        if (ints.length == 0){
            throw  new RuntimeException("is empty");
        }
        int[] newInt = new int[ints.length -1];
        for (int i = 0; i < newInt.length; i++){
            newInt[i] = ints[i];
        }
        int element = ints[0];
        ints = newInt;
        return element;
    }
    //查看是否为空
    public boolean cha(){
        return ints.length == 0;
    }
}
