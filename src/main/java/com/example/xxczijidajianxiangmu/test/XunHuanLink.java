package com.example.xxczijidajianxiangmu.test;

import com.example.xxczijidajianxiangmu.lianbiao.Slink;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/20
 * Time: 9:26
 */
public class XunHuanLink {
    public static void main(String[] args) {
        Slink slink1 = new Slink(1);
        Slink slink2= new Slink(2);
        Slink slink3 = new Slink(3);
        Slink slink4 = new Slink(4);
        Slink slink5 = new Slink(5);

        System.out.println(slink1.getNext().getDate());
        System.out.println(slink1.getNext().getDate());
        slink1.after(slink2);
        slink2.after(slink3);
        slink3.after(slink4);
        slink4.after(slink5);
        System.out.println(slink2.getNext().getNext().getDate());  //4
        System.out.println(slink2.getNext().getNext().getPre().getDate()); //3

    }
}
