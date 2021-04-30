package io.niceseason.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import io.niceseason.common.utils.PageUtils;
import io.niceseason.gulimall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author xiehongfei
 * @email ggfickle@gmail.com
 * @date 2021-04-29 21:47:28
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

