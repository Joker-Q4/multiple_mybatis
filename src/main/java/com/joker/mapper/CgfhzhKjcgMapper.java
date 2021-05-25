package com.joker.mapper;

import com.joker.entity.CgfhzhKjcg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgMapper {

    List<CgfhzhKjcg> findList();
    void insert(List<CgfhzhKjcg> list);
}