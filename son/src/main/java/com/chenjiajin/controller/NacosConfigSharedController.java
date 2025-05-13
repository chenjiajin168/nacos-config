package com.chenjiajin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NacosConfigSharedController {

    @Value("${aa.bb}")
    private String bb;  // son-test.yaml

    @Value("${ee}")
    private String ee;  // son.yaml

    @Value("${gg}")
    private String gg;  // a.yaml

    // http://localhost:91/nacosShared
    @RequestMapping("/nacosShared")
    public String nacosShared() {
        return "远程test的信息: " + bb + "共享配置: " + ee + " 引入的共享配置: " + gg;
        // 远程test的信息: dd共享配置: ff  实现配置共享
        // 远程test的信息: dd共享配置: ff 引入的共享配置: hh
    }

}