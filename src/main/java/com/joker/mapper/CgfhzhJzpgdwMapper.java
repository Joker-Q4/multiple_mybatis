package com.joker.mapper;

import com.joker.entity.CgfhzhJzpgdw;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhJzpgdwMapper {

    List<CgfhzhJzpgdw> findList();
    void insert(List<CgfhzhJzpgdw> list);
}