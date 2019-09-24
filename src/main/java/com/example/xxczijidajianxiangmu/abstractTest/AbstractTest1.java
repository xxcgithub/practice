package com.example.xxczijidajianxiangmu.abstractTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/19
 * Time: 16:13
 */
public class AbstractTest1 {
    public static void main(String[] args) {
        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(2);
        Integer integer = lists.stream().reduce(Integer::sum).get();
        System.out.println(integer);

    }
}

