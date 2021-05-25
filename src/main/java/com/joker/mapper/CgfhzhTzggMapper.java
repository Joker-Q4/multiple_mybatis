package com.joker.mapper;

import com.joker.entity.CgfhzhTzgg;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CgfhzhTzggMapper {

    List<CgfhzhTzgg> findList();
    void insert(List<CgfhzhTzgg> list);
}