package com.example.xxczijidajianxiangmu.adaptable;

import com.example.xxczijidajianxiangmu.service.ServiceTest;
import org.quartz.CronTrigger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;

import java.util.Date;


/*
@Configuration
@EnableScheduling
public class Config implements SchedulingConfigurer {
    @Autowired
    private ServiceTest serviceTest;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addFixedDelayTask(() -> System.out.println("111"+new Date()),1000);
        String corn = "0/2 * * * * ?";
        scheduledTaskRegistrar.addCronTask(() -> {System.out.println("222");serviceTest.get1();},corn);
    }

*/








