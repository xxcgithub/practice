package com.example.xxczijidajianxiangmu.test;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 2019/9/16
 * Time: 10:12
 */
public class FuxiTest {
    public static void main(String[] args) {
        Clock clock = new Clock() {
            @Override
            public ZoneId getZone() {
                return null;
            }

            @Override
            public Clock withZone(ZoneId zone) {
                return null;
            }

            @Override
            public Instant instant() {
                return null;
            }
        };
        LocalDateTime.now(clock);
    }
}
