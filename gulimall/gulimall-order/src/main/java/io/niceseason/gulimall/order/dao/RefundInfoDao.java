package io.niceseason.gulimall.order.dao;

import io.niceseason.gulimall.order.entity.RefundInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:19:35
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
