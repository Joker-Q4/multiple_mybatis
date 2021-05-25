package com.joker.mapper;

import com.joker.entity.CommSysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommSysRoleMapper {

    List<CommSysRole> findList();
    void insert(List<CommSysRole> list);
}