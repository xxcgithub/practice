package com.example.xxczijidajianxiangmu.empty.test;

import com.example.xxczijidajianxiangmu.empty.Student;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/19
 * Time: 11:12
 */
public class StudentTest1 {
    @RequestMapping("/api")
    public void getMessage(@Valid Student student){

    }
}
