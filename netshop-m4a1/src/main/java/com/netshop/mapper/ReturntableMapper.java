package com.netshop.mapper;

import com.netshop.pojo.Returntable;

public interface ReturntableMapper {
    int deleteByPrimaryKey(Integer returnid);

    int insert(Returntable record);

    int insertSelective(Returntable record);

    Returntable selectByPrimaryKey(Integer returnid);

    int updateByPrimaryKeySelective(Returntable record);

    int updateByPrimaryKey(Returntable record);
}