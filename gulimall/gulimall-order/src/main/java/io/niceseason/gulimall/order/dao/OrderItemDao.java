package io.niceseason.gulimall.order.dao;

import io.niceseason.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:19:36
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
