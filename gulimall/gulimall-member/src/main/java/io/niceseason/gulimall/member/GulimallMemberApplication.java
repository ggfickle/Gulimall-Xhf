package io.niceseason.gulimall.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/*
 * 1、 想要调用远程服务
 * ---1)、引入open-feign
 * ---2)、编写一个接口，告诉Springcloud这个接口需要远程调用
 * -------1)声明接口的每一个方法都是调用哪个远程服务的请求
 * 3)、开启远程调用功能 @EnableFeignClients
 * @param null
 * @return
 * @author xiehongfei
 * @date 2021/4/30 0:22
 */
@EnableFeignClients(basePackages = "io.niceseason.gulimall.member.feign")
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallMemberApplication.class, args);
    }

}
