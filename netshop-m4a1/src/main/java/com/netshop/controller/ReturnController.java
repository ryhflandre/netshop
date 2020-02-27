package com.netshop.controller;

import com.netshop.pojo.Returntable;
import com.netshop.service.ReturntableService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/return")
public class ReturnController {
    @Resource
    private ReturntableService returntableService;

    @GetMapping("/list")
    public List<Returntable> list(Integer pagenum,Integer size){
        return null;
    }

    @PostMapping("/add")
    public void addReturn(Returntable returntable){

    }

    @GetMapping("/getReturnById")
    @ResponseBody
    public Returntable getById(Integer returnid){
        return null;
    }

    @PostMapping("/update")
    public void updateReturn(){

    }

}
