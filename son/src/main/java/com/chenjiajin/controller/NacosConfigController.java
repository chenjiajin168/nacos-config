package com.chenjiajin.controller;

import com.chenjiajin.domain.Logtest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope   //只有当前的控制器才会刷新
public class NacosConfigController {

    @Value("${aa.bb}")
    private String bb;

    @Value("${ee}")
    private String ee;

    // http://localhost:91/nacosConfig
    @RequestMapping("/nacosConfig")
    public String nacosConfig() {
        return "远程test的信息: " + bb + "共享配置: " + ee;
        // 远程test的信息: dd共享配置: ff  实现配置共享
    }

    // http://localhost:91/demo
    @RequestMapping("/demo2")
    public void demo2(Logtest data) {
        System.err.println("data = " + data);
    }


}