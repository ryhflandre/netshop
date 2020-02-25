package com.netshop.controller;

import com.netshop.service.*;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class StoreController {
    @Resource
    private AddressService addressService;

    @Resource
    private AdministratorService administratorService;

    @Resource
    private CustomerService customerService;

    @Resource
    private OrderdetailService orderdetailService;

    @Resource
    private OrderhistoryService orderhistoryService;

    @Resource
    private OrdertableService ordertableService;

    @Resource
    private ProductdetailService productdetailService;

    @Resource
    private ProductService productService;

    @Resource
    private ReturnhistoryService returnhistoryService;

    @Resource
    private ReturntableService returntableService;



}
