package com.star.demo2.service;

import com.star.demo2.rpc.Demo1ServerRpc;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhixin.huang
 * @date 2019/09/03 19:08
 */
@Service
public class Demo2ServiceImpl implements Demo2Service {

    @Resource
    private Demo1ServerRpc demo1ServerRpc;

    @Override
    public String demo1() {
        return demo1ServerRpc.demo1();
    }
}
