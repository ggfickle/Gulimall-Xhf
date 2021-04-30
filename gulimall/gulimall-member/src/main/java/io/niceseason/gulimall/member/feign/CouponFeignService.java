package io.niceseason.gulimall.member.feign;

import io.niceseason.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: CouponFeignService
 * @author: xiehongfei
 * @description:
 **/

@FeignClient("gulimall-coupon") //告诉springcloud这个接口是一个远程客户端
public interface CouponFeignService {

    @RequestMapping("/coupon/coupon/menmber/list")
    public R menbercoupons();
}
