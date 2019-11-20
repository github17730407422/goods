package com.dj.goods.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.swagger.annotations.Api;

@Controller
@RequestMapping("/goodsYm")
@Api(tags = "1.0",description = "页面测试接口", value="页面测试接口")
public class TestController {
    
    private static final Logger logger = LoggerFactory.getLogger(TestController.class);
    
    @RequestMapping(value ="/index",method = RequestMethod.GET)
    public String index() {
        System.out.println("进去");
        return "goods/list";
    }

}
