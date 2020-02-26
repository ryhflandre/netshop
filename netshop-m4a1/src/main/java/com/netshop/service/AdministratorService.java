package com.netshop.service;

import com.netshop.pojo.Administrator;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AdministratorService {
    List<Administrator> list(Integer page, Integer size);
}
