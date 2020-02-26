package com.netshop.controller;

import com.netshop.pojo.Orderdetail;
import com.netshop.pojo.Ordertable;
import com.netshop.service.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

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

    @PostMapping("/store/list")
    public String storeList(Model model, @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size){
        List<Ordertable> ordertables = ordertableService.list(page,size);

        model.addAttribute("order",ordertables);
        return "list";
    }

    @PostMapping("/store/add")
    @ResponseBody
    public boolean storeAdd(@RequestBody Ordertable ordertable){
        ordertableService.add(ordertable);
        return false;
    }

    @PostMapping("/store/del")
    @ResponseBody
    public boolean storeDel(@RequestBody Long orderid){
        ordertableService.del(orderid);
        orderdetailService.del(orderid);
        return false;
    }


    @PostMapping("/store/update")
    @ResponseBody
    public boolean storeUpdate(@RequestBody Ordertable ordertable){
        ordertableService.up(ordertable);
        Orderdetail orderdetail = new Orderdetail();
        orderdetailService.up(orderdetail);
        return false;
    }

    @PostMapping("/upload")
    @ResponseBody
    public String upload(@RequestBody MultipartFile file) {
        return null;
    }


}
