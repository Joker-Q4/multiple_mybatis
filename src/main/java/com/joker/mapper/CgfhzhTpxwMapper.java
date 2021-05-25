package com.joker.mapper;

import com.joker.entity.CgfhzhTpxw;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhTpxwMapper {

    List<CgfhzhTpxw> findList();
    void insert(List<CgfhzhTpxw> list);
}