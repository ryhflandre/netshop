package com.netshop.controller;

import com.netshop.pojo.Administrator;
import com.netshop.pojo.Customer;
import com.netshop.pojo.Ordertable;
import com.netshop.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

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


    @PostMapping("/admin/list")
    public String adminList(Model model, @RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer size){
        List<Administrator> administrators =  administratorService.list(page,size);
        List<Customer> customers = customerService.list();


        return null;
    }

    @PostMapping("/admin/add")
    @ResponseBody
    public boolean adminAdd(@RequestBody Administrator administrator){
        return false;
    }

    @PostMapping("/admin/del")
    @ResponseBody
    public boolean adminDel(@RequestBody Integer adminid){
        return false;
    }


    @PostMapping("/admin/update")
    @ResponseBody
    public boolean adminUpdate(@RequestBody Administrator administrator){
        return false;
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestBody MultipartFile file){
        return null;
    }

}
