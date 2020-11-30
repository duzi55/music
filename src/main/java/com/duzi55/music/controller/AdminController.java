package com.duzi55.music.controller;

import com.alibaba.fastjson.JSONObject;
import com.duzi55.music.DTO.Response;
import com.duzi55.music.service.AdminService;
import com.duzi55.music.utils.Common;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 14:05
 * @description：admin
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    /*
     * 判断是否登录成功
     * */
    @PostMapping("login/status")
    public Response loginStatus(@Param("username") String username,@Param("password") String password, HttpSession session) {
        JSONObject jsonObject = new JSONObject();
        boolean flag = adminService.verifyPassword(username, password);
        if (flag) {
            session.setAttribute(Common.NAME, username);
            return new Response(1, "登录成功");
        }
        return new Response(0, "用户名或密码错误");
    }
}
