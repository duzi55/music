package com.duzi55.music.service.impl;

import com.duzi55.music.dao.AdminMapper;
import com.duzi55.music.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/28 14:03
 * @description：admin
 * @modified By：
 * @version:
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public boolean verifyPassword(String username, String password) {
        return adminMapper.verifyPassword(username, password) > 0;
    }
}
