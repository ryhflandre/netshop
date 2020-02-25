package com.netshop.mapper;

import com.netshop.pojo.Productdetail;

public interface ProductdetailMapper {
    int insert(Productdetail record);

    int insertSelective(Productdetail record);
}