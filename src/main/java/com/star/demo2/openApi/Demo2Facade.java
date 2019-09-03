package com.star.demo2.openApi;

import com.star.demo2.rpc.Demo1ServerRpc;
import com.star.demo2.service.Demo2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhixin.huang
 * @date 2019/09/03 18:50
 */
@RestController
@RequestMapping("api/demo2Facade")
public class Demo2Facade {

    @Resource
    private Demo2Service demo2Service;

    @GetMapping("/demo2")
    public String demo2() {
        return "demo2方法返回值";
    }

    @GetMapping("/demo2Demo1")
    public String demo2Demo1() {
        String demo1 = demo2Service.demo1();
        return "demo2调用demo1服务的方法返回值为：" + demo1;
    }
}
