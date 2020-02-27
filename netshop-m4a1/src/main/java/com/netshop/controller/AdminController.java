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
@RequestMapping("/admin")
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


    @GetMapping("/adminList")
    public String adminList(Model model, @RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer size){
        List<Administrator> administrators =  administratorService.list(page,size);
        List<Customer> customers = customerService.list();

        return "list";
    }

    @GetMapping("/addInAdmin")
    @ResponseBody
    public boolean adminAdd(@RequestBody Administrator administrator){
        administratorService.add(administrator);
        return false;
    }

    @GetMapping("/delectAdmin")
    @ResponseBody
    public boolean adminDel(@RequestBody Integer adminid){
        administratorService.del(adminid);
        return false;
    }


    @GetMapping("/updateAdmin")
    @ResponseBody
    public boolean adminUpdate(@RequestBody Administrator administrator) {
        administratorService.up(administrator);
        return false;
    }

    @GetMapping("/upload")
    @ResponseBody
    public String upload(@RequestBody MultipartFile file){
        return null;
    }


    @GetMapping("/login")
    public String login(Administrator administrator){

        return null;
    }

    @GetMapping("/getAdminById")
    @ResponseBody
    public Administrator getAdminById(Integer adminid){
        return null;
    }

    @GetMapping("/delectMatchAdmin")
    @ResponseBody
    public boolean adminDelMany(@RequestBody List<Integer> adminids){
        return false;
    }

}
