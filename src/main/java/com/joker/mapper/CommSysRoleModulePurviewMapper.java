package com.joker.mapper;

import com.joker.entity.CommSysRoleModulePurview;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommSysRoleModulePurviewMapper {

    List<CommSysRoleModulePurview> findList();
    void insert(List<CommSysRoleModulePurview> list);
}