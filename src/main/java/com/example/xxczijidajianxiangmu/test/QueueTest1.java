package com.example.xxczijidajianxiangmu.test;

import com.example.xxczijidajianxiangmu.queue.Queue1;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/18
 * Time: 13:19
 */
public class QueueTest1 {
    public static void main(String[] args) {
        Queue1 queue1 = new Queue1();
        queue1.ru(1);
        queue1.ru(2);
        int chu = queue1.chu();
        System.out.println(chu);
        queue1.cha();
    }
}
