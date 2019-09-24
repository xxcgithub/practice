package com.example.xxczijidajianxiangmu.jobConfig;

import com.example.xxczijidajianxiangmu.job.JobLei;
import org.quartz.Trigger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.quartz.CronTriggerFactoryBean;
import org.springframework.scheduling.quartz.JobDetailFactoryBean;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.scheduling.quartz.SimpleTriggerFactoryBean;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/11
 * Time: 11:21
 */

/**
 * 既然是配置类 要加上@Configuration  要@bean
 */
@Configuration
public class JobConfig {
    //1.创建job对象并关联job类
    @Bean
    public JobDetailFactoryBean jobDetailFactoryBean (){
        JobDetailFactoryBean jobDetailFactoryBean = new JobDetailFactoryBean();
        jobDetailFactoryBean.setJobClass(JobLei.class);
        return jobDetailFactoryBean;
    }
    //2.创建trigger 并关联 jobdetail
/*
@Bean
    public SimpleTriggerFactoryBean simpleTriggerFactoryBean (JobDetailFactoryBean jobDetailFactoryBean){
        SimpleTriggerFactoryBean simpleTriggerFactoryBean = new SimpleTriggerFactoryBean();
        simpleTriggerFactoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        simpleTriggerFactoryBean.setRepeatInterval(2000); //每隔2秒执行一次
        simpleTriggerFactoryBean.setRepeatCount(5); //再来五次
        return simpleTriggerFactoryBean;
    }
*/

    //2.1  创建corntrigger
    @Bean
    public CronTriggerFactoryBean cronTriggerFactoryBean (JobDetailFactoryBean jobDetailFactoryBean){
        CronTriggerFactoryBean cronTriggerFactoryBean = new CronTriggerFactoryBean();
        //第一步绑定 第二步设置触发规则
        cronTriggerFactoryBean.setJobDetail(jobDetailFactoryBean.getObject());
        cronTriggerFactoryBean.setCronExpression("0/2 * * * * ?");
        return cronTriggerFactoryBean;
    }

    //3.创建schedule 并关联trigger
    @Bean
    public SchedulerFactoryBean schedulerFactoryBean (CronTriggerFactoryBean cronTriggerFactoryBean){
        SchedulerFactoryBean schedulerFactoryBean = new SchedulerFactoryBean();
        schedulerFactoryBean.setTriggers(cronTriggerFactoryBean.getObject());
        //schedulerFactoryBean.setJobFactory(myAdaptable);
        return schedulerFactoryBean;
    }
}
