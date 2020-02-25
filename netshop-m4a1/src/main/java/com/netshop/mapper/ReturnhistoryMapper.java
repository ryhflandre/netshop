package com.netshop.mapper;

import com.netshop.pojo.Returnhistory;

public interface ReturnhistoryMapper {
    int deleteByPrimaryKey(Integer returnhistoryid);

    int insert(Returnhistory record);

    int insertSelective(Returnhistory record);

    Returnhistory selectByPrimaryKey(Integer returnhistoryid);

    int updateByPrimaryKeySelective(Returnhistory record);

    int updateByPrimaryKey(Returnhistory record);
}