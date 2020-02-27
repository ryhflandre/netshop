package com.netshop.controller;

import com.netshop.service.AddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/address")
public class AddressContoller {
    @Resource
    private AddressService addressService;


    @GetMapping("/getAddressAll")
    public String list(){
        return  null;
    }

}
