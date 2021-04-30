package io.niceseason.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:08:38
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

