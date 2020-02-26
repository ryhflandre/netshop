package com.netshop.mapper;

import com.netshop.pojo.Ordertable;

import java.util.List;

public interface OrdertableMapper {
    int deleteByPrimaryKey(Long orderid);

    int insert(Ordertable record);

    int insertSelective(Ordertable record);

    Ordertable selectByPrimaryKey(Long orderid);

    int updateByPrimaryKeySelective(Ordertable record);

    int updateByPrimaryKey(Ordertable record);

    List<Ordertable> list(int i, Integer size);
}