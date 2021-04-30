package io.niceseason.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.CouponEntity;

import java.util.Map;

/**
 * 优惠券信息
 *
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:08:38
 */
public interface CouponService extends IService<CouponEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

