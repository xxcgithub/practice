package com.example.xxczijidajianxiangmu.job;

import com.example.xxczijidajianxiangmu.service.ServiceTest;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/11
 * Time: 11:16
 */


/**
 * job  类  首先实现接口
 */
@Component
public class JobLei implements Job {
    @Autowired
    private ServiceTest serviceTest;
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println("方法执行了"+ new Date());
        serviceTest.get1();
    }
}
