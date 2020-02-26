package com.netshop.service.Imp;

import com.netshop.mapper.OrdertableMapper;
import com.netshop.pojo.Ordertable;
import com.netshop.service.OrdertableService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class OrdertableServiceImp implements OrdertableService {

    @Resource
    private OrdertableMapper ordertableMapper;
    @Override
    public List<Ordertable> list(Integer page, Integer size) {
        return ordertableMapper.list(((page-1)*size),size);
    }

    @Override
    public void add(Ordertable ordertable) {
        ordertableMapper.insert(ordertable);
    }

    @Override
    public void del(Long orderid) {
        ordertableMapper.deleteByPrimaryKey(orderid);
    }

    @Override
    public void up(Ordertable ordertable) {

    }
}
