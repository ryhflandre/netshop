package com.netshop.service;

import com.netshop.pojo.Orderdetail;
import com.netshop.pojo.Ordertable;

public interface OrderdetailService {
    void up(Orderdetail orderdetail);

    void del(Long orderid);
}
