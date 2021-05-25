package com.joker.mapper;

import com.joker.entity.CgfhzhZhmu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhZhmuMapper {

    List<CgfhzhZhmu> findList();
    void insert(List<CgfhzhZhmu> list);
}