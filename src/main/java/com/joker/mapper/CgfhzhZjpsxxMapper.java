package com.joker.mapper;

import com.joker.entity.CgfhzhZjpsxx;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhZjpsxxMapper {

    List<CgfhzhZjpsxx> findList();
    void insert(List<CgfhzhZjpsxx> list);
}