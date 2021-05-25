package com.joker.mapper;

import com.joker.entity.CommSysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommSysUserMapper {

    List<CommSysUser> findList();
    void insert(List<CommSysUser> list);
}