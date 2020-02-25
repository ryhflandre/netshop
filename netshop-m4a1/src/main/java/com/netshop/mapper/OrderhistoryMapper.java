package com.netshop.mapper;

import com.netshop.pojo.Orderhistory;

public interface OrderhistoryMapper {
    int deleteByPrimaryKey(Long orderhistoryid);

    int insert(Orderhistory record);

    int insertSelective(Orderhistory record);

    Orderhistory selectByPrimaryKey(Long orderhistoryid);

    int updateByPrimaryKeySelective(Orderhistory record);

    int updateByPrimaryKey(Orderhistory record);
}