package com.joker.mapper;

import com.joker.entity.CommSysUserZj;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommSysUserZjMapper {

    List<CommSysUserZj> findList();
    void insert(List<CommSysUserZj> list);
}