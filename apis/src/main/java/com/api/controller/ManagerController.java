package com.api.controller;

import com.api.module.Result;
import com.api.module.mis_manager;
import com.api.service.ManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping(value = "/index")
public class ManagerController {
    @Resource
    private ManagerService managerService;

    @RequestMapping(value = "/list" ,method = RequestMethod.GET)
    @ResponseBody
    public Result getList(){

        return new Result(200,"成功",managerService.getList(),managerService.getCount());
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String test(){

        return "Test";
    }
}
