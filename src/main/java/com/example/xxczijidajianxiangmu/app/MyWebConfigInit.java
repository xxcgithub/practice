package com.example.xxczijidajianxiangmu.app;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/16
 * Time: 11:43
 */
public class MyWebConfigInit {
    public static void main(String[] args) {
        AnnotationConfigWebApplicationContext annotationConfigWebApplicationContext =
                new AnnotationConfigWebApplicationContext();
        annotationConfigWebApplicationContext.register();
        annotationConfigWebApplicationContext.refresh();
    }
}
