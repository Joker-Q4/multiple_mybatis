package com.joker.mapper;

import com.joker.entity.CgfhzhKjcgPjqk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgPjqkMapper {

    List<CgfhzhKjcgPjqk> findList();
    void insert(List<CgfhzhKjcgPjqk> list);
}