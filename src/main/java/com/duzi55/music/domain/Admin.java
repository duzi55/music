package com.duzi55.music.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 13:49
 * @description：管理员
 * @modified By：
 * @version: 1
 */
@Data
public class Admin implements Serializable {
    //主键
    private Integer id;
    //姓名
    private String  name;
    //密码
    private String  password;
}
