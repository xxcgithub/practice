package com.example.xxczijidajianxiangmu.empty;

import javax.validation.constraints.Max;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/19
 * Time: 11:08
 */
public class Student {
    @Max(10)
    private int id;
    private String name;
}
