package com.netshop.mapper;

import com.netshop.pojo.Administrator;

public interface AdministratorMapper {
    int deleteByPrimaryKey(Integer administratorid);

    int insert(Administrator record);

    int insertSelective(Administrator record);

    Administrator selectByPrimaryKey(Integer administratorid);

    int updateByPrimaryKeySelective(Administrator record);

    int updateByPrimaryKey(Administrator record);
}