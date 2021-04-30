package io.niceseason.gulimall.product.dao;

import io.niceseason.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 21:47:28
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
