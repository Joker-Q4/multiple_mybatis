package com.joker.mapper;

import com.joker.entity.CgfhzhZdgf;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhZdgfMapper {

    List<CgfhzhZdgf> findList();
    void insert(List<CgfhzhZdgf> list);
}