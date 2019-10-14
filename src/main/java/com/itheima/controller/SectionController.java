package com.itheima.controller;

import com.itheima.service.impl.SectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jj
 * @version 1.0
 * @date 2019/10/10 20:15
 */
@Controller
@RequestMapping("/product")
public class SectionController {
    @Autowired
    private SectionService sectionService;

    public void setSectionService(SectionService sectionService) {
        this.sectionService = sectionService;
    }

    /**
     * @return User类
     * 挂号功能显示功能
     */
    @RequestMapping("save")
    @ResponseBody
    public void regist(@RequestParam(required=false) String name, String birthday,String gender ,String sid){
        sectionService.addRegist(name,birthday,gender,sid);
    }
}
