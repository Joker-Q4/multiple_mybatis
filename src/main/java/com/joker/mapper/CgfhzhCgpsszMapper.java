package com.joker.mapper;

import com.joker.entity.CgfhzhCgpssz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhCgpsszMapper {

    List<CgfhzhCgpssz> findList();
    void insert(List<CgfhzhCgpssz> list);
}