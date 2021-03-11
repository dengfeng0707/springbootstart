package com.dfliu.shirodemo.shirodemo.controller;

import com.dfliu.shirodemo.shirodemo.entity.DfUserInfoEntity;
import com.dfliu.shirodemo.shirodemo.service.IDdUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MyController {

    @Autowired
    private IDdUserInfoService dbUserInfoService;

    @RequestMapping(value = "/login")
    public String login(Model model) {
        DfUserInfoEntity userInfo = this.dbUserInfoService.getUserInfo(1L);
        model.addAttribute("msg", null != userInfo ? userInfo.getName() : "no userName");

        return "index";
    }
}
