package com.joker.mapper;

import com.joker.entity.CommKeyValues;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommKeyValuesMapper {

    List<CommKeyValues> findList();
    void insert(List<CommKeyValues> list);
}