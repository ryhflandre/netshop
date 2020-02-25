package com.netshop.controller;

import com.netshop.pojo.Administrator;
import com.netshop.pojo.Ordertable;
import com.netshop.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

@Controller
public class AdminController {

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


    @PostMapping("/store/list")
    public String storeList(Model model, @RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer size){
        return null;
    }

    @PostMapping("/store/add")
    @ResponseBody
    public boolean storeAdd(@RequestBody Ordertable ordertable){
        return false;
    }

    @PostMapping("/store/del")
    @ResponseBody
    public boolean storeDel(@RequestBody Integer orderid){
        return false;
    }


    @PostMapping("/store/update")
    @ResponseBody
    public boolean storeUpdate(@RequestBody Ordertable ordertable){
        return false;
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestBody MultipartFile file){
        return null;
    }

}
