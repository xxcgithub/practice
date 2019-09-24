package com.example.xxczijidajianxiangmu.jobConfig;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/11
 * Time: 14:44
 */

/*@Component("myAdaptable")
public class MyAdaptablejobFactory extends AdaptableJobFactory {
    @Autowired
    private AutowireCapableBeanFactory autowireCapableBeanFactory;   //这个就是可以将实例 注入到IOC 容器中
    @Override
    protected Object createJobInstance(TriggerFiredBundle bundle) throws Exception {
        //这个方法是通过反射返回job类实例
        Object jobInstance = super.createJobInstance(bundle);
        autowireCapableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
    }
}*/
