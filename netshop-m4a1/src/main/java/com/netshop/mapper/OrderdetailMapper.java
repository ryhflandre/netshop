package com.netshop.mapper;

import com.netshop.pojo.Orderdetail;

public interface OrderdetailMapper {
    int insert(Orderdetail record);

    int insertSelective(Orderdetail record);
}