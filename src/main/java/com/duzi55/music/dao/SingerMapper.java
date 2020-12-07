package com.duzi55.music.dao;

import com.duzi55.music.domain.Singer;

import java.util.List;

/**
 * @author ：duzi55
 * @date ：Created in 2020/11/30 21:30
 * @description：
 * @modified By：
 * @version:
 */
public interface SingerMapper {
    public int insert(Singer singner);
    public int update(Singer singner);
    public int delete(Integer id);
    public Singer selectById(Integer id);
    public List<Singer> allSinger();
    public List<Singer> singerOfName(String name);
    public List<Singer> singerOfSex(Integer sex);

}
