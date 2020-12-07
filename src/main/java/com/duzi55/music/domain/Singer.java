package com.duzi55.music.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 13:49
 * @description：歌手
 * @modified By：
 * @version: 1
 */
@Data
public class Singer implements Serializable {
    //主键
    private Integer id;
    //姓名
    private String  name;
    //密码
    private Byte  sex;
    //头像
    private String pic;
    private Date birth;
    private String location;
    private String introduction;
}
