package com.joker.mapper;

import com.joker.entity.CgfhzhZhssdw;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhZhssdwMapper {

    List<CgfhzhZhssdw> findList();
    void insert(List<CgfhzhZhssdw> list);
}