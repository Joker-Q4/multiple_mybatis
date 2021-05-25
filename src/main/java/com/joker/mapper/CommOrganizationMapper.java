package com.joker.mapper;

import com.joker.entity.CommOrganization;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommOrganizationMapper {

    List<CommOrganization> findList();
    void insert(List<CommOrganization> list);
}