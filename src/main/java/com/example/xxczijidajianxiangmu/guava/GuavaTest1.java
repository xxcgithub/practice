package com.example.xxczijidajianxiangmu.guava;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/19
 * Time: 15:54
 */
public class GuavaTest1 {
    public static void main(String[] args) {
        String a  ="2";
        String b = "";
        String v = null;
        String s = checkNotNull(v);
        System.out.println(s);
    }
}
