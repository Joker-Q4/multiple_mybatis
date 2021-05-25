package com.joker.mapper;

import com.joker.entity.CgfhzhKjcgJcqk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgJcqkMapper {

    List<CgfhzhKjcgJcqk> findList();
    void insert(List<CgfhzhKjcgJcqk> list);
}