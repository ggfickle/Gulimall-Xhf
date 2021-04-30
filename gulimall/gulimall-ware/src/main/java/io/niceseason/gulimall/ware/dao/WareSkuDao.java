package io.niceseason.gulimall.ware.dao;

import io.niceseason.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 23:21:57
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
