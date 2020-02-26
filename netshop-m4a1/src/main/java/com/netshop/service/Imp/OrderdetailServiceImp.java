package com.netshop.service.Imp;

import com.netshop.mapper.OrderdetailMapper;
import com.netshop.pojo.Orderdetail;
import com.netshop.pojo.Ordertable;
import com.netshop.service.OrderdetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderdetailServiceImp implements OrderdetailService {
    @Resource
    private OrderdetailMapper orderdetailMapper;

    @Override
    public void up(Orderdetail orderdetail) {
        orderdetailMapper.insert(orderdetail);
    }

    @Override
    public void del(Long orderid) {
        orderdetailMapper.del(orderid);
    }
}
