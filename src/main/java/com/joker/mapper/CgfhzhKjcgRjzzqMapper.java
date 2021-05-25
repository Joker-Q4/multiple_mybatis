package com.joker.mapper;

import com.joker.entity.CgfhzhKjcgRjzzq;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhKjcgRjzzqMapper {

    List<CgfhzhKjcgRjzzq> findList();
    void insert(List<CgfhzhKjcgRjzzq> list);
}