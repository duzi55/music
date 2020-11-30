package com.duzi55.music.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 15:28
 * @description：test
 * @modified By：
 * @version:
 */
@RestController
public class TestController {
    @RequestMapping("test")
    public String test1(){
        return "test";
    }
}
