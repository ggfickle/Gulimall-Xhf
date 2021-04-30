package io.niceseason.gulimall.coupon.dao;

import io.niceseason.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:08:38
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
