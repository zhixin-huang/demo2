package com.star.demo2.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author zhixin.huang
 * @date 2019/09/03 18:51
 */
@FeignClient(name = "demo1", url = "http://localhost:8081")
public interface Demo1ServerRpc {

    @GetMapping("api/demo1Facade/demo1")
    String demo1();
}
