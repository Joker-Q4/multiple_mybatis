package com.joker.mapper;

import com.joker.entity.CgfhzhKjcgZl;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgZlMapper {

    List<CgfhzhKjcgZl> findList();
    void insert(List<CgfhzhKjcgZl> list);
}