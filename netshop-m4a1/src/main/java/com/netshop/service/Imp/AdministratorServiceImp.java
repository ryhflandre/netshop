package com.netshop.service.Imp;

import com.netshop.mapper.AdministratorMapper;
import com.netshop.pojo.Administrator;
import com.netshop.service.AdministratorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public class AdministratorServiceImp implements AdministratorService {

    @Resource
    private AdministratorMapper administratorMapper;


    @Override
    public List<Administrator> list(Integer page, Integer size) {
        return administratorMapper.list(((page-1)*size),size);
    }

    @Override
    public void add(Administrator administrator) {
        administratorMapper.insert(administrator);
    }

    @Override
    public void del(Integer adminid) {
        administratorMapper.deleteByPrimaryKey(adminid);
    }

    @Override
    public void up(Administrator administrator) {
        administratorMapper.updateByPrimaryKey(administrator);
    }
}
