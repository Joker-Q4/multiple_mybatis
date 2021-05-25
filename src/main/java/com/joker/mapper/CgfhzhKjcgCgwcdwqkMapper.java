package com.joker.mapper;

import com.joker.entity.CgfhzhKjcgCgwcdwqk;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgCgwcdwqkMapper {

    List<CgfhzhKjcgCgwcdwqk> findList();
    void insert(List<CgfhzhKjcgCgwcdwqk> list);
}