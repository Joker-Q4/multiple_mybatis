package com.joker.mapper;

import com.joker.entity.CgfhzhKjcgZtrz;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgZtrzMapper {

    List<CgfhzhKjcgZtrz> findList();
    void insert(List<CgfhzhKjcgZtrz> list);
}