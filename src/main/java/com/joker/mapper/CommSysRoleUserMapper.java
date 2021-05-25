package com.joker.mapper;

import com.joker.entity.CommSysRoleUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommSysRoleUserMapper {

    List<CommSysRoleUser> findList();
    void insert(List<CommSysRoleUser> list);
}