package com.duzi55.music.DTO;

import com.duzi55.music.utils.Common;
import lombok.Data;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 14:30
 * @description：响应
 * @modified By：
 * @version:
 */
@Data
public class Response {
    public Integer code;
    public String msg;
    public Object content;
    public Response(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
    public Response(Integer code, String msg, Object content) {
        this.code = code;
        this.msg = msg;
        this.content = content;
    }
}
