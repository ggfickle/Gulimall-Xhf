package io.niceseason.gulimall.order.dao;

import io.niceseason.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:19:36
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
