package com.example.xxczijidajianxiangmu.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/16
 * Time: 8:57
 */
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter =
                new FastJsonHttpMessageConverter();
        converters.add(fastJsonHttpMessageConverter);
    }
}
