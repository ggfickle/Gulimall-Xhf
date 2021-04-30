package io.niceseason.gulimall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * nacos配置中心
 * 1)、引入依赖
 *         <dependency>
 *             <groupId>com.alibaba.cloud</groupId>
 *             <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
 *         </dependency>
 *  2）、创建一个bootstrap.properties
 *  spring.application.name=gulimall-coupon
 *
 * spring.cloud.nacos.config.server-addr=127.0.0.1:8848
 *
 * 3)、需要给配置中心添加一个数据集（data id） gulimall-coupon.properties .默认规则。应用名.properties
 * 4)、给应用名.properties添加任何的配置内容
 * 5）、动态获取配置
 * @RefreshScope: 动态获取并且刷新配置
 * @Value("${user.name}")  获取到配置
 *    如果配置中心和当前应用的配置文件中都配置了相同的项，则以配置中心为优先
 *
 * 2、细节
 * 1）、命名空间：配置隔离
 * 默认使用public ，配置的时候使用命名空间的uuid值
 * -----1）开发、测试、生产，利用命名空间做配置隔离
 * -----2）每一个微服务之间互相隔离配置，每一个微服务都创建自己的命名空间，只加载自己命名空间下的所有的配置
 * 2） 配置集：所有配置的集合
 * 3）配置集ID：类似于配置的文件名
 * 4)、配置组  可使用配置组来分组
 *
  * 3、同时加载多个配置集：
 *  -----spring.cloud.nacos.config.ext-config[0].data-id
  *
  * @return
  * @author xiehongfei
  * @date 2021/4/30 1:22
  */
@EnableDiscoveryClient
@SpringBootApplication
public class GulimallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallCouponApplication.class, args);
    }

}
