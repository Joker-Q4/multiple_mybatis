package com.joker.mapper;

import com.joker.entity.CommSysModule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CommSysModuleMapper {

    List<CommSysModule> findList();
    void insert(List<CommSysModule> list);
}