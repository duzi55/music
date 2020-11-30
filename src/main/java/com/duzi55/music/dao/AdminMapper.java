package com.duzi55.music.dao;

import org.springframework.stereotype.Repository;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 13:51
 * @description：mapper
 * @modified By：
 * @version:
 */
@Repository
public interface AdminMapper {
    /*
    * 验证密码是否正确
    * */
    public int verifyPassword(String username,String password);
}
