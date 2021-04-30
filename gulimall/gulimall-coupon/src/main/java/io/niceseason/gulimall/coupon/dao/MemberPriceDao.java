package io.niceseason.gulimall.coupon.dao;

import io.niceseason.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:08:37
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
