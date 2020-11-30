package com.duzi55.music.service;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 14:01
 * @description：admin service
 * @modified By：
 * @version:
 */
public interface AdminService {
    /*
    * 验证账号密码
    * */
    public boolean verifyPassword(String username,String password);
}
