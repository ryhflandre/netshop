package com.netshop.service;

import com.netshop.pojo.Ordertable;

import java.util.List;

public interface OrdertableService {

    List<Ordertable> list(Integer page, Integer size);

    void add(Ordertable ordertable);

    void del(Long orderid);

    void up(Ordertable ordertable);
}
