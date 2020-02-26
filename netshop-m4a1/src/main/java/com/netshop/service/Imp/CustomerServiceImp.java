package com.netshop.service.Imp;

import com.netshop.mapper.CustomerMapper;
import com.netshop.pojo.Customer;
import com.netshop.service.CustomerService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class CustomerServiceImp implements CustomerService {

    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> list() {
        return customerMapper.list();
    }
}
